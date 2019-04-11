package irvine.oeis.a233;

import irvine.oeis.LinearRecurrence;

/**
 * A233820 Period 4: repeat <code>[20, 5, 15, 10]</code>.
 * @author Sean A. Irvine
 */
public class A233820 extends LinearRecurrence {

  /** Construct the sequence. */
  public A233820() {
    super(new long[] {1, 0, 0, 0}, new long[] {20, 5, 15, 10});
  }
}
