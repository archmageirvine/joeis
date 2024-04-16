package irvine.oeis.a364;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000129;

/**
 * A364818 Number of distinct prime divisors of A000129(n) (Pell numbers).
 * @author Sean A. Irvine
 */
public class A364818 extends A000129 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return Z.valueOf(Functions.OMEGA.i(super.next()));
  }
}
