package irvine.oeis.a120;

import irvine.math.z.Z;

/**
 * A120591 Self-convolution cube of A120590, such that a(n) = 4*A120590(n) for n&gt;=2.
 * @author Georg Fischer
 */
public class A120591 extends A120590 {

  private int mN = -1;

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? Z.ONE : (mN == 1 ? Z.THREE : super.next().multiply(4));
  }
}
