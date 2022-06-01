package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016805 (4n)^5.
 * @author Sean A. Irvine
 */
public class A016805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016805() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1024, 32768, 248832, 1048576, 3200000});
  }
}
