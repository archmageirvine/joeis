package irvine.oeis.a394;

import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.InverseSigma;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394168 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A394168 extends Sequence1 {

  private final LinkedList<Z> mA = new LinkedList<>();
  private Z mM = Z.FIVE;
  private Z mFirst = null;
  private int mLen = 0;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mN > mLen) {
      while (mA.isEmpty()) {
        mM = mM.add(1);
        final Set<Z> s = new TreeSet<>(InverseSigma.inverseSigma(Functions.SIGMA1.z(mM), 1));
        if (s.size() > 1) {
          final Z s0 = Functions.SIGMA0.z(mM);
          for (final Z v : s) {
            if (Functions.SIGMA0.z(v).equals(s0)) {
              if (v.compareTo(mM) < 0) {
                // We have already handled this row
                mA.clear();
                break;
              } else {
                mA.add(v);
              }
            }
          }
          if (mA.size() == 1) {
            mA.clear();
          }
        }
      }
      mFirst = mA.pollFirst();
      mLen = mA.size();
    }
    return mFirst;
  }
}
