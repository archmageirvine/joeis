package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A053205 Row sums of A053201.
 * @author Sean A. Irvine
 */
public class A053205 extends AbstractSequence {

  private final A053204 mSeq = new A053204();
  
  /** Construct the sequence. */
  public A053205() {
    super(2);
    mSeq.next();
    mSeq.next();
  }

  @Override
  public Z next() {
    return mSeq.next().subtract(2);
  }
}
