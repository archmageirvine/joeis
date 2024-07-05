package irvine.oeis.a071;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071181 Number of k such that phi(k) divides phi(n).
 * @author Sean A. Irvine
 */
public class A071181 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    for (final Z d : Jaguar.factor(Functions.PHI.l(++mN)).divisors()) {
      cnt += InverseEuler.inversePhi(d).size();
    }
    return Z.valueOf(cnt);
  }
}
