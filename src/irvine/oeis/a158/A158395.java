package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158395 <code>729n - 1</code>.
 * @author Sean A. Irvine
 */
public class A158395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158395() {
    super(new long[] {-1, 2}, new long[] {728, 1457});
  }
}
