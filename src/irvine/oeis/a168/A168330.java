package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168330 Period <code>2</code>: repeat <code>3, -2</code>.
 * @author Sean A. Irvine
 */
public class A168330 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168330() {
    super(new long[] {1, 0}, new long[] {3, -2});
  }
}
