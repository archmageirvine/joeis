package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155557.
 * @author Sean A. Irvine
 */
public class A155557 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155557() {
    super(new long[] {1, -3, 3}, new long[] {53089, 53093, 53101});
  }
}
