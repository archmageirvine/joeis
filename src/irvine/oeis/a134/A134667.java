package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134667 Period <code>6</code>: repeat <code>[0, 1, 0, 0, 0, -1]</code>.
 * @author Sean A. Irvine
 */
public class A134667 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134667() {
    super(new long[] {-1, 0, -1, 0}, new long[] {0, 1, 0, 0});
  }
}
