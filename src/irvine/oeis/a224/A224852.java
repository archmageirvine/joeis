package irvine.oeis.a224;

import irvine.math.z.Z;
import irvine.oeis.a054.A054870;

/**
 * A224852 Positions of the incrementally largest terms in the continued fraction for Khinchin's constant.
 * @author Georg Fischer
 */
public class A224852 extends A054870 {

  /** Construct the sequence. */
  public A224852() {
    setOffset(0);
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
