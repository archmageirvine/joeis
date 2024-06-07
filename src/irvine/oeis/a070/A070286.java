package irvine.oeis.a070;

import java.util.Set;

import irvine.math.z.InverseSigma;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070286 Numbers k such that the equation sigma(sigma(x)) = k has solutions.
 * @author Sean A. Irvine
 */
public class A070286 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
//    final Z t = Z.valueOf(144);
//    System.out.println(t + " " + InverseSigma.countInverseSigma(t, 1) + " " + InverseSigma.inverseSigma(t, 1));
    while (true) {
      ++mN;
      final Set<Z> invSigma = InverseSigma.inverseSigma(Z.valueOf(mN), 1);
      for (final Z inv : invSigma) {
        final Set<Z> ii = InverseSigma.inverseSigma(inv, 1);
        if (!ii.isEmpty()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
