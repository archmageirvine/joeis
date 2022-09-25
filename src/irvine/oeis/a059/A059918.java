package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059918 a(n) = (3^(2^n)-1)/2.
 * @author Georg Fischer
 */
public class A059918 extends A059917 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
