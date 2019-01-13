package irvine.oeis.a204;

import irvine.oeis.LinearRecurrence;

/**
 * A204090.
 * @author Sean A. Irvine
 */
public class A204090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204090() {
    super(new long[] {-4, 14, -16, 7}, new long[] {1, 2, 8, 34});
  }
}
