package irvine.oeis.a264;

import irvine.oeis.LinearRecurrence;

/**
 * A264447.
 * @author Sean A. Irvine
 */
public class A264447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264447() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 110, 276, 510, 825});
  }
}
