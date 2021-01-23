package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089660 Let S1 := (n,t)-&gt;add( k^t * add( binomial(n,j), j=0..k), k=0..n); a(n) = S1(n,3).
 * @author Sean A. Irvine
 */
public class A089660 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089660() {
    super(new long[] {32, -80, 80, -40, 10}, new long[] {0, 2, 35, 276, 1522});
  }
}
