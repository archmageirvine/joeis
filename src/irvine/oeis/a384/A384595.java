package irvine.oeis.a384;

import irvine.oeis.Combiner;
import irvine.oeis.a118.A118704;

/**
 * A384595 a(n) = neg(M(n)), where M(n) is the n X n circulant matrix with (row 1) = (F(2), F(3), ..., F(n+1)), where F = A000045 (Fibonacci numbers), and neg(M(n)) is the negative part of the determinant of M(n); see A380661.
 * @author Sean A. Irvine
 */
public class A384595 extends Combiner {

  /** Construct the sequence. */
  public A384595() {
    super(1, new A118704(), new A384594().skip(), (a, b) -> a.subtract(b).divide2());
  }
}

