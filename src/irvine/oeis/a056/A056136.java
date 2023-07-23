package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a029.A029578;

/**
 * A056136 Largest positive integer whose harmonic mean with another positive integer is n.
 * @author Sean A. Irvine
 */
public class A056136 extends AbstractSequence {

  private final A029578 mSeq1 = new A029578();

  /** Construct the sequence. */
  public A056136() {
    super(1);
  }

  private long mN = 0;

  {
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(++mN).divide2();
  }
}
