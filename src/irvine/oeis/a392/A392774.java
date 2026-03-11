package irvine.oeis.a392;

import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.InverseSigma;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392774 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A392774 extends Sequence1 {

  private final LinkedList<Z> mA = new LinkedList<>();
  private Z mN = Z.FIVE;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      mN = mN.add(1);
      final Set<Z> s = new TreeSet<>(InverseSigma.inverseSigma(Functions.SIGMA1.z(mN), 1));
      if (s.size() > 1) {
        final Z s0 = Functions.SIGMA0.z(mN);
        for (final Z v : s) {
          if (Functions.SIGMA0.z(v).equals(s0)) {
            if (v.compareTo(mN) < 0) {
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
    return mA.pollFirst();
  }
}
