package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016201.
 * @author Sean A. Irvine
 */
public class A016201 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016201() {
    super(new long[] {14, -23, 10}, new long[] {1, 10, 77});
  }
}
