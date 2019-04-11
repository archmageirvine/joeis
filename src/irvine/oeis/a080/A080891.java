package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080891 Period 5: repeat <code>[0, 1, -1, -1, 1]</code>.
 * @author Sean A. Irvine
 */
public class A080891 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080891() {
    super(new long[] {-1, -1, -1, -1}, new long[] {0, 1, -1, -1});
  }
}
