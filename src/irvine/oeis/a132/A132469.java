package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132469 a(n) = (2^(5n)-1)/31.
 * @author Sean A. Irvine
 */
public class A132469 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132469() {
    super(new long[] {-32, 33}, new long[] {0, 1});
  }
}
