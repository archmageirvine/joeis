package irvine.oeis.a113;

import irvine.math.z.Z;
import irvine.oeis.a005.A005187;

/**
 * A113474 a(n) = a(floor(n/2)) + floor(n/2) with a(1) = 1.
 * @author Georg Fischer
 */
public class A113474 extends A005187 {

  private int mN = 0;

  /** Construct the sequence. */
  public A113474() {
    setOffset(1);
    super.next(); // skip A005187(0)
  }

  @Override
  public Z next() {
    // a(n) = A005187(n) - n + 1
    ++mN;
    return super.next().add(1).subtract(mN);
  }
}
