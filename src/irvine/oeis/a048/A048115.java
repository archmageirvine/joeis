package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A048115 (1/2)*Sum{T(n,i): i=0,1,...,n}, where T is given by A048113.
 * @author Sean A. Irvine
 */
public class A048115 extends AbstractSequence {

  private final A048114 mSeq1 = new A048114();

  /** Construct the sequence. */
  public A048115() {
    super(3);
  }

  {
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().divide2();
  }
}
