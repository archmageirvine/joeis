package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128785.
 * @author Sean A. Irvine
 */
public class A128785 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128785() {
    super(new long[] {216, -108, 18}, new long[] {0, 6, 144});
  }
}
