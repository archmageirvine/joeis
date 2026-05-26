package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a008.A008287;

/**
 * A005724 Coefficient of x^(3*n-1) and of x^(3*n+1) in the expansion of (1+x+x^2+x^3)^(2*n).
 * @author Sean A. Irvine
 */
public class A005724 extends A008287 {

  /** Construct the sequence. */
  public A005724() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    return quadrinomial(mN, 3 * mN / 2 - 1);
  }
}

