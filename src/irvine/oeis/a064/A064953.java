package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A064953 Where the even terms appear in A064413.
 * @author Sean A. Irvine
 */
public class A064953 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A064953() {
    super(1, 1, new A064413(), Z::isEven);
  }
}
