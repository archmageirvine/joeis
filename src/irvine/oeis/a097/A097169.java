package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097169 a(n) = Sum_{k=0..n} C(floor((n+1)/2),floor((k+1)/2)) * 3^k.
 * @author Sean A. Irvine
 */
public class A097169 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097169() {
    super(new long[] {90, -90, -19, 19, 1}, new long[] {1, 4, 13, 52, 133});
  }
}
