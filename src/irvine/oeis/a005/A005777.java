package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a259.A259985;

/**
 * A005777 Rook polynomials.
 * @author Sean A. Irvine
 */
public class A005777 extends A259985 {

  /** Construct the sequence. */
  public A005777() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return get(mN, mN - 1);
  }
}
