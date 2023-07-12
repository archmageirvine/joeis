package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;

/**
 * A064469 The even subsequence of A064413.
 * @author Sean A. Irvine
 */
public class A064469 extends FilterSequence {

  /** Construct the sequence. */
  public A064469() {
    super(1, new A064413(), Z::isEven);
  }
}
