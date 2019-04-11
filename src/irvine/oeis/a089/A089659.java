package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089659 Let S1 := <code>(n</code>,t)-&gt;add( k^t * add( binomial(n,j), <code>j=0..k), k=0..n)</code>; <code>a(n) =</code> S1(n,2).
 * @author Sean A. Irvine
 */
public class A089659 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089659() {
    super(new long[] {-16, 32, -24, 8}, new long[] {0, 2, 19, 104});
  }
}
