package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042540 Numerators of continued fraction convergents to <code>sqrt(799)</code>.
 * @author Sean A. Irvine
 */
public class A042540 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042540() {
    super(new long[] {-1, 0, 0, 0, 848, 0, 0, 0}, new long[] {28, 85, 113, 424, 23857, 71995, 95852, 359551});
  }
}
