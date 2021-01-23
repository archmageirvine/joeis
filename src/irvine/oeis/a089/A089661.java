package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089661 Let S1 := (n,t)-&gt;add( k^t * add( binomial(n,j), j=0..k), k=0..n); a(n) = S1(n,4).
 * @author Sean A. Irvine
 */
public class A089661 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089661() {
    super(new long[] {-64, 192, -240, 160, -60, 12}, new long[] {0, 2, 67, 764, 5492, 30304});
  }
}
