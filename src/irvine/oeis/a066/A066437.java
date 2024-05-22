package irvine.oeis.a066;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066437 a(n) = max_{k} {T(n,k)} where T(n,k) is the "phi/sigma tug-of-war sequence with seed n" defined by T(n,1) = phi(n), T(n,2) = sigma(phi(n)), T(n,3) = phi(sigma(phi(n))), ..., T(n,k) = phi(T(n,k-1)) if k is odd and = sigma(T(n,k-1)) if k is even.
 * @author Sean A. Irvine
 */
public class A066437 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z max = Z.ZERO;
    final HashSet<Z> phiSeen = new HashSet<>();
    final HashSet<Z> sigmaSeen = new HashSet<>();
    Z t = mN;
    while (true) {
      t = Functions.PHI.z(t);
      if (!phiSeen.add(t)) {
        return max;
      }
      max = max.max(t);
      t = Functions.SIGMA1.z(t);
      if (!sigmaSeen.add(t)) {
        return max;
      }
      max = max.max(t);
    }
  }
}
