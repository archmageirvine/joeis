package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016888 (5n+3)^4.
 * @author Sean A. Irvine
 */
public class A016888 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016888() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {81, 4096, 28561, 104976, 279841});
  }
}
