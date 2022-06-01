package irvine.oeis.a108;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A108732 a(0)=22; if n odd, a(n) = a(n-1)/2, otherwise a(n) = 4*a(n-1).
 * @author Sean A. Irvine
 */
public class A108732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108732() {
    super(new long[] {2, 0}, new long[] {22, 11});
  }
}
