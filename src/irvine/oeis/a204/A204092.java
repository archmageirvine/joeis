package irvine.oeis.a204;

import irvine.oeis.LinearRecurrence;

/**
 * A204092.
 * @author Sean A. Irvine
 */
public class A204092 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204092() {
    super(new long[] {-4, 16, -19, 8}, new long[] {1, 3, 17, 91});
  }
}
