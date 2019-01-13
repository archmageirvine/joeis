package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016885.
 * @author Sean A. Irvine
 */
public class A016885 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016885() {
    super(new long[] {-1, 2}, new long[] {3, 8});
  }
}
