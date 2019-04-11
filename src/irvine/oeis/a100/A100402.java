package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100402 Digital root of <code>4^n</code>.
 * @author Sean A. Irvine
 */
public class A100402 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100402() {
    super(new long[] {1, 0, 0}, new long[] {1, 4, 7});
  }
}
