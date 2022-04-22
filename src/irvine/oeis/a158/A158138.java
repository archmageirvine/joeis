package irvine.oeis.a158;

import irvine.math.z.Z;
import irvine.oeis.a069.A069905;

/**
 * A158138 Number of nondecreasing integer sequences of length 4 with sum zero and sum of absolute values 2n.
 * @author Georg Fischer
 */
public class A158138 extends A069905 {

  private long mN;

  /** Construct the sequence. */
  public A158138() {
    super.next();
    mN = 0;
  }

  @Override
  public Z next() {
    return Z.valueOf(++mN / 2 + 1).square().add(super.next().multiply2());
  }
}
