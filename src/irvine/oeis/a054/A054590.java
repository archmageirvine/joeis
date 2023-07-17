package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000273;
import irvine.oeis.a003.A003085;

/**
 * A054590 Number of disconnected digraphs with n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A054590 extends A000273 {

  /** Construct the sequence. */
  public A054590() {
    super(1);
  }

  {
    super.next(); // skip 0th
  }

  private final Sequence mA = new A003085();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
