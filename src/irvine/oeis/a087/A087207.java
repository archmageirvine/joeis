package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007947;
import irvine.oeis.a048.A048675;

/**
 * A087207 A binary representation of the primes that divide a number, shown in decimal.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A087207 extends Sequence1 implements DirectSequence {

  private final A048675 mSeq1 = new A048675();
  private final A007947 mSeq2 = new A007947();

  @Override
  public Z next() {
    return mSeq1.a(mSeq2.next());
  }

  @Override
  public Z a(final Z n) {
    return mSeq1.a(mSeq2.a(n));
  }

  @Override
  public Z a(final int n) {
    return mSeq1.a(mSeq2.a(n));
  }
}
