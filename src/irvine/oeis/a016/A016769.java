package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016769.
 * @author Sean A. Irvine
 */
public class A016769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016769() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 243, 7776, 59049, 248832, 759375});
  }
}
