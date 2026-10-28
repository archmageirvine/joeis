package irvine.oeis.a100;

import irvine.math.z.Z;
import irvine.oeis.a003.A003215;

/**
 * A100656 a(n)=1 if the n-th hex (or centered hexagonal) number (A003215) is a prime, otherwise 0.
 * @author Sean A. Irvine
 */
public class A100656 extends A003215 {

  @Override
  public Z next() {
    return super.next().isProbablePrime() ? Z.ONE : Z.ZERO;
  }
}
