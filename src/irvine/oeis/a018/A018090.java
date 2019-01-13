package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018090.
 * @author Sean A. Irvine
 */
public class A018090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018090() {
    super(new long[] {270, -147, 22}, new long[] {1, 22, 337});
  }
}
