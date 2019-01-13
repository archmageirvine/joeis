package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016934.
 * @author Sean A. Irvine
 */
public class A016934 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016934() {
    super(new long[] {1, -3, 3}, new long[] {4, 64, 196});
  }
}
