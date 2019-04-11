package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158060 <code>25n + 1</code>.
 * @author Sean A. Irvine
 */
public class A158060 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158060() {
    super(new long[] {-1, 2}, new long[] {26, 51});
  }
}
