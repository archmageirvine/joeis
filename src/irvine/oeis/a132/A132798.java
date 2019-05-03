package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132798 Period <code>6</code>: repeat <code>[0, 2, 1, 0, -2, -1]</code>.
 * @author Sean A. Irvine
 */
public class A132798 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132798() {
    super(new long[] {-1, 0, 0}, new long[] {0, 2, 1});
  }
}
