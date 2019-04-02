package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135169 Period 4: repeat [1, 5, 9, 5].
 * @author Sean A. Irvine
 */
public class A135169 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135169() {
    super(new long[] {1, -1, 1}, new long[] {1, 5, 9});
  }
}
