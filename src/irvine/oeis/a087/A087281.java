package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087281 <code>a(n) =</code> Lucas(7*n).
 * @author Sean A. Irvine
 */
public class A087281 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087281() {
    super(new long[] {1, 29}, new long[] {2, 29});
  }
}
