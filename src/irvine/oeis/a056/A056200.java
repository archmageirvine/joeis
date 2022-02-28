package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056200 a(n) = 2^n - A056045(n).
 * @author Georg Fischer
 */
public class A056200 extends A056045 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).subtract(super.next());
  }
}
