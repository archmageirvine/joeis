package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026466 <code>a(1) = 1;</code> for <code>n &gt; 1, a(n) =</code> least positive integer <code>&gt; a(n-1)</code> and not <code>a(i)^2 + a(j)^2</code> for <code>1&lt;=i&lt;j&lt;=n-1</code>.
 * @author Sean A. Irvine
 */
public class A026466 extends MemorySequence {

  private final TreeSet<Z> mForbidden = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  protected Z computeNext() {
    do {
      mN = mN.add(1);
    } while (Z.TWO.equals(mN) || mForbidden.remove(mN));
    for (final Z t : this) {
      mForbidden.add(t.square().add(mN.square()));
    }
    return mN;
  }
}
