package irvine.oeis.a065;
// manually partsum at 2023-06-11 21:05

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a064.A064413;

/**
 * A065057 Partial sums of A064413.
 * @author Georg Fischer
 */
public class A065057 extends PartialSumSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A065057() {
    super(0, new A064413());
  }

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ZERO : super.next();
  }
}
