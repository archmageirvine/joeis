package irvine.oeis.a242;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A242496 a(n)=sum_{j=0..n} sum_{i=0..j} F(i)*L(j), where F(n)=A000045(n) and L(n)=A000032(n).
 * @author Sean A. Irvine
 */
public class A242496 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242496() {
    super(new long[] {-1, 2, 4, -6, -2, 4}, new long[] {0, 1, 7, 23, 72, 204});
  }
}
