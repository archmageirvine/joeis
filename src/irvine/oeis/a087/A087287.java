package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087287 <code>a(n) = Lucas(9*n)</code>.
 * @author Sean A. Irvine
 */
public class A087287 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087287() {
    super(new long[] {1, 76}, new long[] {2, 76});
  }
}
