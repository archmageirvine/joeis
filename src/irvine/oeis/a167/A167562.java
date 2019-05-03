package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167562 The fifth row of the <code>ED2</code> array <code>A167560</code>.
 * @author Sean A. Irvine
 */
public class A167562 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167562() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {120, 480, 1344, 3072, 6144});
  }
}
