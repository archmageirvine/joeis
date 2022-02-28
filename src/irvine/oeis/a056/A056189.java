package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056189 a(n) = 2^n - A056188(n).
 * @author Georg Fischer
 */
public class A056189 extends A056188 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).subtract(super.next());
  }
}
