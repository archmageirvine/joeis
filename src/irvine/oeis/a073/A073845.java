package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073845 a(1)=a(2)=1, a(n+2)=a(n+1)+a(n)+(-2)^n.
 * @author Sean A. Irvine
 */
public class A073845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073845() {
    super(new long[] {2, 3, -1}, new long[] {1, 1, 0});
  }
}
