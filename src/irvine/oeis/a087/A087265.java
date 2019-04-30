package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087265 Lucas numbers <code>L(8*n)</code>.
 * @author Sean A. Irvine
 */
public class A087265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087265() {
    super(new long[] {-1, 47}, new long[] {2, 47});
  }
}
