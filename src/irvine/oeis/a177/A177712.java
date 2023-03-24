package irvine.oeis.a177;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a057.A057716;

/**
 * A177712 Even numbers that have a nontrivial odd divisor.
 * @author Georg Fischer
 */
public class A177712 extends AbstractSequence {

  private int mN = 0;
  private final A057716 mSeq = new A057716();

  /** Construct the sequence. */
  public A177712() {
    super(1);
    mSeq.next();
  }

  @Override
  public Z next() {
    ++mN;
    return Z.TWO.multiply(mSeq.next());
  }
}
