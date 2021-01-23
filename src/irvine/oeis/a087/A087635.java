package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087635 a(n)=S(n,3) where S(n,m)=sum(k=0,n,binomial(n,k)*fibonacci(m*k)).
 * @author Sean A. Irvine
 */
public class A087635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087635() {
    super(new long[] {-4, 6}, new long[] {0, 2});
  }
}
