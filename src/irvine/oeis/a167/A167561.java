package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167561 The fourth row of the <code>ED2</code> array <code>A167560</code>.
 * @author Sean A. Irvine
 */
public class A167561 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167561() {
    super(new long[] {-1, 4, -6, 4}, new long[] {24, 80, 192, 384});
  }
}
