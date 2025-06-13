package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027981 a(n) = Sum_{k=0..2*n} (k+1)*T(n,k), T given by A027960.
 * @author Sean A. Irvine
 */
public class A027981 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027981() {
    super(new long[] {4, -8, 5}, new long[] {1, 10, 40});
  }
}
