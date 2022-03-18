package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A073675 Rearrangement of natural numbers such that a(n) is the smallest proper divisor of n not included earlier but if no such divisor exists then a(n) is the smallest proper multiple of n not included earlier, subject always to the condition that a(n) is not equal to n.
 * but if no such divisor exists then a(n) is the smallest proper multiple of n not included earlier,
 * subject always to the condition that a(n) is not equal to n.
 * If valuation(n, 2) is even, a(n) = 2n; otherwise a(n)=n/2.
 * @author Georg Fischer
 */
public class A073675 implements Sequence {

  private int mN;

  /** Construct the sequence. */
  public A073675() {
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(((ZUtils.valuation(Z.TWO, Z.valueOf(mN)) & 1) == 0) ? 2 * mN : mN / 2);
  }
}
