package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159612 INVERT transform of <code>(1, 3, 1, 3, 1,</code>...).
 * @author Sean A. Irvine
 */
public class A159612 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159612() {
    super(new long[] {4, 1}, new long[] {1, 4});
  }
}
