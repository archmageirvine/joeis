package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027779 <code>a(n) =</code> 3*(n+1)*C(n+2,6).
 * @author Sean A. Irvine
 */
public class A027779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027779() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {15, 126, 588, 2016, 5670, 13860, 30492, 61776});
  }
}
