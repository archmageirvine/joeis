package irvine.oeis.a158;

import irvine.oeis.FiniteSequence;

/**
 * A158242 Smallest n-digit number with distinct digits such that every k-digit substring <code>(k &lt;= n)</code> taken from the left is divisible by k <code>(k=1..n)</code>.
 * @author Georg Fischer
 */
public class A158242 extends FiniteSequence {

  /** Construct the sequence. */
  public A158242() {
    super(1, 10, 102, 1024, 10245, 102456, 1024569, 12965408, 381654720L, 3816547290L);
  }
}
