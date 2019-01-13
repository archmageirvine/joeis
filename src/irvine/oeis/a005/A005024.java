package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005024.
 * @author Sean A. Irvine
 */
public class A005024 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005024() {
    super(new long[] {-5, 20, -21, 8}, new long[] {8, 43, 196, 820});
  }
}
