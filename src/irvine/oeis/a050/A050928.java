package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a007.A007908;

/**
 * A050928 Sum of digits of A050926(n).
 * @author Sean A. Irvine
 */
public class A050928 extends A007908 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().bitCount());
  }
}
