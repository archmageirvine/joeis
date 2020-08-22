package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030089 a(n) = prime^3 and digits of prime do not appear in a(n).
 * @author Sean A. Irvine
 */
public class A030089 extends A030087 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
