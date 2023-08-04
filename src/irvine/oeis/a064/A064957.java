package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A064957 Where the odd terms appear in A064413.
 * @author Sean A. Irvine
 */
public class A064957 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A064957() {
    super(1, 1, new A064413(), Z::isOdd);
  }
}
