package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100174 Structured tetrakis hexahedral numbers (vertex structure <code>5)</code>.
 * @author Sean A. Irvine
 */
public class A100174 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100174() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 14, 59, 156});
  }
}
