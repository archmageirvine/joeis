package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003770.
 * @author Sean A. Irvine
 */
public class A003770 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003770() {
    super(new long[]{-12, 8, 11}, new long[]{3, 42, 474});
  }
}
