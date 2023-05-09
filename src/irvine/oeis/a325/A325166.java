package irvine.oeis.a325;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a056.A056239;
import irvine.oeis.a297.A297113;

/**
 * A325166 Size of the internal portion of the integer partition with Heinz number n.
 * @author Georg Fischer
 */
public class A325166 extends AbstractSequence {

  private A056239 mSeq1 = new A056239();
  private A297113 mSeq2 = new A297113();

  /** Construct the sequence. */
  public A325166() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
