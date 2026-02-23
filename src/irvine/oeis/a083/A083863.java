package irvine.oeis.a083;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A083863 Consider recurrence b(0) = n/3, b(n) = b(n-1)*floor(b(n-1)); sequence gives first integer reached, or -1 if no integer is ever reached.
 * @author Sean A. Irvine
 */
public class A083863 extends AbstractSequence {

  private long mN = 5;

  /** Construct the sequence. */
  public A083863() {
    super(6);
  }

  @Override
  public Z next() {
    Q b = new Q(++mN, 3);
    while (!b.isInteger()) {
      b = b.multiply(b.floor());
    }
    return b.toZ();
  }
}

