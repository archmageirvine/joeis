package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225832.
 * @author Sean A. Irvine
 */
public class A225832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225832() {
    super(new long[] {-65536, 256, 256}, new long[] {1, 136, 16576});
  }
}
