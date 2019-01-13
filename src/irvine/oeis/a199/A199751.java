package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199751.
 * @author Sean A. Irvine
 */
public class A199751 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199751() {
    super(new long[] {-11, 12}, new long[] {2, 17});
  }
}
