package irvine.oeis.a088;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A088942 a(n)=60*sum(1&lt;=i&lt;=j&lt;=k&lt;=n,i^2*j/k).
 * @author Sean A. Irvine
 */
public class A088942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088942() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 60, 390, 1450, 4045, 9421});
  }
}
