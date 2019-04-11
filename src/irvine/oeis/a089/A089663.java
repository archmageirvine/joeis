package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089663 Let S1 := <code>(n</code>,t)-&gt;add( k^t * add( binomial(n,j), j=0..k), k=0..n); <code>a(n) =</code> S1(n,6).
 * @author Sean A. Irvine
 */
public class A089663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089663() {
    super(new long[] {-256, 1024, -1792, 1792, -1120, 448, -112, 16}, new long[] {0, 2, 259, 6284, 77180, 646960, 4235864, 23313408});
  }
}
