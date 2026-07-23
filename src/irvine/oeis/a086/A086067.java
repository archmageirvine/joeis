package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086067 Bit string encoding occurrence of digits of n in decimal representation: d-th bit is set iff d occurs in (n)10, 0 &lt;= d &lt; 10.
 * @author Sean A. Irvine
 */
public class A086067 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return new Z(Integer.toBinaryString(Functions.SYNDROME.i(++mN)));
  }
}
