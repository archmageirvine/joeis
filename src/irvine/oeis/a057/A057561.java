package irvine.oeis.a057;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.a003.A003586;

/**
 * A057561 Size of the largest set encompassing no <code>{x, 2x, 3x}</code> contained in <code>D(n) =</code> the first <code>n 3-smooth</code> numbers <code>{1, 2, 3, 4, 6, 8, 9, 12, 16, 18, 24, 27,...} (A003586)</code>.
 * @author Sean A. Irvine
 */
public class A057561 extends A003586 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final ArrayList<Long> mD = new ArrayList<>();
  private int mBest = 0;

  private void search(final Set<Long> used, final int k) {
    final int size = used.size();
    if (k < 0) {
      if (size > mBest) {
        if (mVerbose) {
          System.out.println("New best solution: " + used);
        }
        mBest = size;
      }
      return;
    }
    if (size + k < mBest) {
      return; // Even if we include them all we will not better current solution
    }
    // Include element k if possible
    final Long v = mD.get(k);
    if (!used.contains(2 * v) || !used.contains(3 * v)) {
      used.add(v);
      search(used, k - 1);
      used.remove(v);
    }
    // Exclude element k
    search(used, k - 1);
  }

  @Override
  public Z next() {
    final long t = super.next().longValueExact();
    mD.add(t);
    final HashSet<Long> used = new HashSet<>();
    used.add(t); // Safe to assume either no better solution than before or that new element is used
    search(used, mD.size() - 2);
    return Z.valueOf(mBest);
  }
}
