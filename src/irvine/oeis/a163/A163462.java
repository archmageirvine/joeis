package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163462 a(n) = 20*a(n-1) - 98*a(n-2) for n &gt; 1; a(0) = 1, a(1) = 11.
 * @author Sean A. Irvine
 */
public class A163462 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163462() {
    super(new long[] {-98, 20}, new long[] {1, 11});
  }
}
