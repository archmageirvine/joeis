package irvine.oeis.a180;
// Generated by gen_seq4.pl A180281/bteonk

import irvine.math.z.Z;

/**
 * A180283 Number of arrangements of n indistinguishable balls in n boxes with the maximum number of balls in any box equal to 3.
 * @author Georg Fischer
 */
public class A180283 extends A180281 {

  private int mN = 2;

  {
    setOffset(3);
  }

  @Override
  public Z next() {
    ++mN;
    return super.triangleElement(mN, 3);
  }
}

