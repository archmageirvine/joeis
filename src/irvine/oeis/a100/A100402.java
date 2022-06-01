package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100402 Digital root of 4^n.
 * @author Sean A. Irvine
 */
public class A100402 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100402() {
    super(new long[] {1, 0, 0}, new long[] {1, 4, 7});
  }
}
