package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080874 a(n)*a(n+3) - a(n+1)*a(n+2) = 5, given a(0)=a(1)=1, a(2)=3.
 * @author Sean A. Irvine
 */
public class A080874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080874() {
    super(new long[] {-1, 0, 10, 0}, new long[] {1, 1, 3, 8});
  }
}
