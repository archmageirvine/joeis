package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089658 Let S1 := <code>(n</code>,t)-&gt;add( k^t * add( <code>binomial(n,j), j=0..k), k=0..n)</code>; <code>a(n) = S1(n,1)</code>.
 * @author Sean A. Irvine
 */
public class A089658 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089658() {
    super(new long[] {8, -12, 6}, new long[] {0, 2, 11});
  }
}
