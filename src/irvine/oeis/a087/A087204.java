package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087204 Period <code>6</code>: repeat <code>[2, 1, -1, -2, -1, 1]</code>.
 * @author Sean A. Irvine
 */
public class A087204 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087204() {
    super(new long[] {-1, 1}, new long[] {2, 1});
  }
}
