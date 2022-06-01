package irvine.oeis.a006;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A006478 a(n) = a(n-1) + a(n-2) + F(n) - 1, a(0) = a(1) = 0, where F() = Fibonacci numbers A000045.
 * @author Georg Fischer
 */
public class A006478 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A006478() {
    super(0, "[[0],[1],[1],[-3],[-1],[3],[-1]]", "0, 0, 0, 1");
  }
}
