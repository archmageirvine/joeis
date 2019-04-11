package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072173 <code>a(n) = (2*n+1)*239^(2*n+1)</code>.
 * @author Sean A. Irvine
 */
public class A072173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072173() {
    super(new long[] {-3262808641L, 114242}, new long[] {239, 40955757});
  }
}
