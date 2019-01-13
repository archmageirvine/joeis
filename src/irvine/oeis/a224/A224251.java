package irvine.oeis.a224;

import irvine.oeis.LinearRecurrence;

/**
 * A224251.
 * @author Sean A. Irvine
 */
public class A224251 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224251() {
    super(new long[] {-5, 5, 0, 0, 1}, new long[] {8, 13, 18, 23, 48});
  }
}
