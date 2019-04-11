package irvine.oeis.a058;

import irvine.oeis.LinearRecurrence;

/**
 * A058184 "Real rabbits": <code>a(n)</code> Real(c(n) where complex c(n)=a(n)+ib(n) and c(0)=i, c(1)=-i, c(n)=c(n-1)+ic(n-2).
 * @author Sean A. Irvine
 */
public class A058184 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058184() {
    super(new long[] {-1, 0, -1, 2}, new long[] {0, 0, -1, 0});
  }
}
