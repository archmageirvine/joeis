package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;

/**
 * A064471 The odd subsequence of A064413.
 * @author Sean A. Irvine
 */
public class A064471 extends FilterSequence {

  /** Construct the sequence. */
  public A064471() {
    super(1, new A064413(), Z::isOdd);
  }
}
