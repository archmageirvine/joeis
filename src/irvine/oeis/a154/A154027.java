package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154027 a(n+2) = 100*a(n+1) - a(n), a(1)=0, a(2)=10.
 * @author Sean A. Irvine
 */
public class A154027 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154027() {
    super(new long[] {-1, 100}, new long[] {0, 10});
  }
}
