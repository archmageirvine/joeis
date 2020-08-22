package irvine.oeis.a072;

import irvine.oeis.SemiprimeSequence;
import irvine.oeis.a000.A000045;

/**
 * A072381 Numbers n such that Fibonacci(n) is a semiprime.
 * @author Sean A. Irvine
 */
public class A072381 extends SemiprimeSequence {

  /** Construct the sequence. */
  public A072381() {
    super(new A000045(), 0);
  }
}
