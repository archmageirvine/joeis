package irvine.oeis.a087;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A087423 a(n)=S(3*n,3)/S(n,3) where S(n,m)=sum(k=0,n,binomial(n,k)*fibonacci(m*k)).
 * @author Sean A. Irvine
 */
public class A087423 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087423() {
    super(1, new long[] {64, -128, 32}, new long[] {32, 768, 20672});
  }
}
