package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272690 <code>a(n) =</code> 22*Sum_{i=0..n-2} 46^i*2^(n-2-i) <code>+ 2^(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A272690 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272690() {
    super(new long[] {-92, 48}, new long[] {1, 24});
  }
}
