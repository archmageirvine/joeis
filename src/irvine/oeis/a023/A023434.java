package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023434 Dying rabbits: a(n) = a(n-1) + a(n-2) - a(n-4).
 * @author Sean A. Irvine
 */
public class A023434 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023434() {
    super(new long[] {-1, 0, 1, 1}, new long[] {0, 1, 1, 2});
  }
}
