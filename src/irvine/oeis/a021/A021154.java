package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021154.
 * @author Sean A. Irvine
 */
public class A021154 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021154() {
    super(new long[] {-110, 197, -105, 19}, new long[] {1, 19, 256, 3066});
  }
}
