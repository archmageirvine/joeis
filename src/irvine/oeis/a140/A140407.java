package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140407 A000225 interleaved with A000051.
 * @author Sean A. Irvine
 */
public class A140407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140407() {
    super(new long[] {2, 2, -1}, new long[] {1, 2, 3});
  }
}
