package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158374 <code>625n - 1</code>.
 * @author Sean A. Irvine
 */
public class A158374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158374() {
    super(new long[] {-1, 2}, new long[] {624, 1249});
  }
}
