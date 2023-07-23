package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a023.A023022;

/**
 * A049806 Number of Farey fractions of order n that are &lt;=1/2; cf. A049805.
 * @author Sean A. Irvine
 */
public class A049806 extends AbstractSequence {

  private final A023022 mSeq1 = new A023022();

  /** Construct the sequence. */
  public A049806() {
    super(1);
  }

  private Z mSum = null;

  @Override
  public Z next() {
    mSum = mSum == null ? Z.ONE : mSum.add(mSeq1.next());
    return mSum;
  }
}
