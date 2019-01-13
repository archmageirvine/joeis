package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206526.
 * @author Sean A. Irvine
 */
public class A206526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206526() {
    super(new long[] {-1, 1, 1}, new long[] {31, 106, 168});
  }
}
