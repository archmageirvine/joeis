package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a005.A005043;

/**
 * A039968 An example of a d-perfect sequence.
 * @author Sean A. Irvine
 */
public class A039968 extends AbstractSequence {

  private final A005043 mSeq1 = new A005043();

  /** Construct the sequence. */
  public A039968() {
    super(1);
  }

  private long mMult = -1;

  @Override
  public Z next() {
    final long r = mSeq1.next().mod(3);
    mMult = -mMult;
    return Z.valueOf((3 + r * mMult) % 3);
  }
}

