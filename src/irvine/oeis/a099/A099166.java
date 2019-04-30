package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099166 G.f.: <code>(1+x^2)/((1-2x)(1-x-x^2); a(n)=3a(n-1)-a(n-2)-2a(n-3); a(n)=5*2^n-L(n+3)</code>; a(n)=sum{k=0..n, <code>(L(k)-0^k)2^(n-k)}</code>.
 * @author Sean A. Irvine
 */
public class A099166 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099166() {
    super(new long[] {-2, -1, 3}, new long[] {1, 3, 9});
  }
}
