package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a007.A007510;

/**
 * A064110 Let s(n) = n-th single prime (cf. A007510). Sequence is defined by recurrence a(n+1) = s(a(n)), n = 0,1,2,..., a(0)=1.
 * @author Sean A. Irvine
 */
public class A064110 extends AbstractSequence {

  private final A007510 mSeq1 = new A007510();

  /** Construct the sequence. */
  public A064110() {
    super(0);
  }

  private long mA = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (mA == 0) {
      mA = 1;
    } else {
      while (++mM < mA) {
        mSeq1.next();
      }
      mA = mSeq1.next().longValueExact();
    }
    return Z.valueOf(mA);
  }
}
