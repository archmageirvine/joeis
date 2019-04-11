package irvine.oeis.a272;

import irvine.oeis.FiniteSequence;

/**
 * A272333 Values of Fibonacci(n+1) that divides <code>n!</code>.
 * @author Georg Fischer
 */
public class A272333 extends FiniteSequence {

  /** Construct the sequence. */
  public A272333() {
    super(1, 2, 3, 8, 21, 144, 46368);
  }
}
