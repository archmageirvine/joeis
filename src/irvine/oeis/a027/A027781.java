package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027781 4*(n+1)*C(n+2,8).
 * @author Sean A. Irvine
 */
public class A027781 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027781() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {28, 288, 1620, 6600, 21780, 61776, 156156, 360360, 772200, 1555840});
  }
}
