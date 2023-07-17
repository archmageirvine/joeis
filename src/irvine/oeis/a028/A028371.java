package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028371 a(n) = (2^(n-1)-1)!*2^((2^(n-1)-1)-1).
 * @author Sean A. Irvine
 */
public class A028371 extends A028366 {

  /** Construct the sequence. */
  public A028371() {
    super(2);
  }

  private int mN = 0;

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().shiftLeft(Z.ONE.shiftLeft(++mN).longValueExact() - 2);
  }
}
