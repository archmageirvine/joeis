package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261544 <code>a(n) =</code> Sum_{k=0..n} 1000^k.
 * @author Sean A. Irvine
 */
public class A261544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261544() {
    super(new long[] {-1000, 1001}, new long[] {1, 1001});
  }
}
