package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042861 Denominators of continued fraction convergents to <code>sqrt(962)</code>.
 * @author Sean A. Irvine
 */
public class A042861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042861() {
    super(new long[] {1, 62}, new long[] {1, 62});
  }
}
