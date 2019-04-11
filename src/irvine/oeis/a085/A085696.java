package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085696 <code>a(n) =</code> L(n) L(n+1) L(n+2) <code>/ 2,</code> where L(n) = Lucas number (A000032).
 * @author Sean A. Irvine
 */
public class A085696 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085696() {
    super(new long[] {-1, -3, 6, 3}, new long[] {3, 6, 42, 154});
  }
}
