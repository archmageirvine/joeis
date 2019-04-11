package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255465 <code>a(n) =</code> A255464(2^n-1).
 * @author Sean A. Irvine
 */
public class A255465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255465() {
    super(new long[] {4, 3}, new long[] {1, 6});
  }
}
