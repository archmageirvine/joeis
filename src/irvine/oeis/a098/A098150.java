package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098150.
 * @author Sean A. Irvine
 */
public class A098150 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098150() {
    super(new long[] {-1, -3}, new long[] {-3, 11});
  }
}
