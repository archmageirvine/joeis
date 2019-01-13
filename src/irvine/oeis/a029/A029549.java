package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029549.
 * @author Sean A. Irvine
 */
public class A029549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029549() {
    super(new long[] {1, -35, 35}, new long[] {0, 6, 210});
  }
}
