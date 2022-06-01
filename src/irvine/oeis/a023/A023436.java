package irvine.oeis.a023;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A023436 Dying rabbits: a(n) = a(n-1) + a(n-2) - a(n-6).
 * @author Sean A. Irvine
 */
public class A023436 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023436() {
    super(new long[] {-1, 0, 0, 0, 1, 1}, new long[] {0, 1, 1, 2, 3, 5});
  }
}
