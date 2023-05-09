package irvine.oeis.a346;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a029.A029837;
import irvine.oeis.a209.A209281;

/**
 * A346633 Sum of even-indexed parts (even bisection) of the n-th composition in standard order.
 * @author Georg Fischer
 */
public class A346633 extends AbstractSequence {

  private A029837 mSeq1 = new A029837();
  private A209281 mSeq2 = new A209281();

  /** Construct the sequence. */
  public A346633() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
