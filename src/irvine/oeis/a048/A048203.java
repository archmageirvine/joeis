package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a004.A004978;

/**
 * A048203 a(n)=T(n,3), array T given by A048201.
 * @author Sean A. Irvine
 */
public class A048203 extends AbstractSequence {

  private final A004978 mSeq1 = new A004978();

  /** Construct the sequence. */
  public A048203() {
    super(3);
  }

  private Z mA = mSeq1.next();
  private Z mB = mSeq1.next();
  private Z mC = mSeq1.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mB;
    mB = mC;
    mC = mSeq1.next();
    return mC.subtract(t);
  }
}
