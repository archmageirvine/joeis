package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033463 EXPCONV of squares <code>A000290</code> with themselves.
 * @author Sean A. Irvine
 */
public class A033463 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033463() {
    super(new long[] {32, -80, 80, -40, 10}, new long[] {1, 8, 50, 248, 1048});
  }
}
