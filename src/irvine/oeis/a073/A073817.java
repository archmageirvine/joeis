package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073817 Tetranacci numbers with different initial conditions: a(n) = a(n-1) + a(n-2) + a(n-3) + a(n-4) starting with a(0)=4, a(1)=1, a(2)=3, a(3)=7.
 * @author Sean A. Irvine
 */
public class A073817 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073817() {
    super(new long[] {1, 1, 1, 1}, new long[] {4, 1, 3, 7});
  }
}
