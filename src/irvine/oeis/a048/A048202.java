package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a004.A004978;

/**
 * A048202 a(n)=T(n,2), array T given by A048201.
 * @author Sean A. Irvine
 */
public class A048202 extends AbstractSequence {

  private final A004978 mSeq1 = new A004978();

  /** Construct the sequence. */
  public A048202() {
    super(2);
  }

  private Z mA = mSeq1.next();
  private Z mB = mSeq1.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mB;
    mB = mSeq1.next();
    return mB.subtract(t);
  }
}
