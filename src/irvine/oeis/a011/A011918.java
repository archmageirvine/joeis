package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A011918 a(n) = A011916(n) + A011922(n) - 1.
 * @author Sean A. Irvine
 */
public class A011918 extends AbstractSequence {

  private final A011916 mSeq1 = new A011916();

  /** Construct the sequence. */
  public A011918() {
    super(1);
  }

  private final A011922 mA = new A011922();

  {
    next(); // skip 0th term
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mA.next()).subtract(1);
  }
}
