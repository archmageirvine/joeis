package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016269.
 * @author Sean A. Irvine
 */
public class A016269 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016269() {
    super(new long[] {24, -26, 9}, new long[] {1, 9, 55});
  }
}
