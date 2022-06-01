package irvine.oeis.a088;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A088943 a(n)=60*sum(1&lt;=i&lt;=j&lt;=k&lt;=n,i*j^2/k).
 * @author Sean A. Irvine
 */
public class A088943 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088943() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 60, 450, 1790, 5195, 12419});
  }
}
