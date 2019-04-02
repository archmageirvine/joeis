package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138268 Negative of the Hankel transform of C(n)-C(n+2), where C(n)=A000108(n).
 * @author Sean A. Irvine
 */
public class A138268 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138268() {
    super(new long[] {-1, -3, -8, -3}, new long[] {1, 4, -17, 17});
  }
}
