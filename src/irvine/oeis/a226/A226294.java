package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226294 Period <code>2</code>: repeat <code>[6, 4]</code>.
 * @author Sean A. Irvine
 */
public class A226294 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226294() {
    super(new long[] {1, 0}, new long[] {6, 4});
  }
}
