package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a008.A008287;

/**
 * A005726 Quadrinomial coefficients.
 * @author Sean A. Irvine
 */
public class A005726 extends A008287 {

  /** Construct the sequence. */
  public A005726() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return quadrinomial(mN, mN - 1);
  }
}

