package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003522 <code>a(n) =</code> Sum_{k=0..n} C(n-k,3k).
 * @author Sean A. Irvine
 */
public class A003522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003522() {
    super(new long[] {1, 1, -3, 3}, new long[] {1, 1, 1, 1});
  }
}
