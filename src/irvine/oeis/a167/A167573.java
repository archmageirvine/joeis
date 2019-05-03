package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167573 The third row of the <code>ED3</code> array <code>A167572</code>.
 * @author Sean A. Irvine
 */
public class A167573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167573() {
    super(new long[] {1, -3, 3}, new long[] {23, 83, 183});
  }
}
