package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066070 <code>a(1) = 1</code>; for m <code>&gt; 0,</code> a(2m) = 2(2m+1), a(2m+1) = 2m+1.
 * @author Sean A. Irvine
 */
public class A066070 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066070() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 6, 3, 10});
  }
}
