package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016994 (7*n+1)^2.
 * @author Sean A. Irvine
 */
public class A016994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016994() {
    super(new long[] {1, -3, 3}, new long[] {1, 64, 225});
  }
}
