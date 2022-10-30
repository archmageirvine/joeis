package irvine.oeis.a024;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000203;

/**
 * A024916 a(n) = Sum_{k=1..n} k*floor(n/k); also Sum_{k=1..n} sigma(k) where sigma(n) = sum of divisors of n (A000203).
 * @author Sean A. Irvine
 */
public class A024916 extends PartialSumSequence {

  /** Construct the sequence. */
  public A024916() {
    super(1, new A000203());
  }
}
