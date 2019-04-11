package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242558 <code>a(n) =</code> Sum_{j=0..n} Sum_{i=0..j} L(i)*F(j) where L(i)=A000032(i) and F(j)=A000045(j).
 * @author Sean A. Irvine
 */
public class A242558 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242558() {
    super(new long[] {-1, 2, 4, -6, -2, 4}, new long[] {0, 3, 9, 29, 80, 220});
  }
}
