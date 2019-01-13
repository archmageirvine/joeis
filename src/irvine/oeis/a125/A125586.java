package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125586.
 * @author Sean A. Irvine
 */
public class A125586 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125586() {
    super(new long[] {36, -33, 10}, new long[] {1, 4, 17});
  }
}
