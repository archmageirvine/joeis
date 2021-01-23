package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056771 a(n) = a(-n) = 34*a(n-1) - a(n-2), and a(0)=1, a(1)=17.
 * @author Sean A. Irvine
 */
public class A056771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056771() {
    super(new long[] {-1, 34}, new long[] {1, 17});
  }
}
