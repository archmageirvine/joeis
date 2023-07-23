package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A026141 a(n) = (s(n)-s(n-1))/2, where s = A026139.
 * @author Sean A. Irvine
 */
public class A026141 extends AbstractSequence {

  private final A026139 mSeq1 = new A026139();

  /** Construct the sequence. */
  public A026141() {
    super(2);
  }

  private Z mA = mSeq1.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mSeq1.next();
    return mA.subtract(t).abs().divide2();
  }
}
