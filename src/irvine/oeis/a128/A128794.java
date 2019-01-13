package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128794.
 * @author Sean A. Irvine
 */
public class A128794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128794() {
    super(new long[] {-4096, 2048, -384, 32}, new long[] {0, 8, 512, 13824});
  }
}
