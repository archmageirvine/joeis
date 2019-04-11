package irvine.oeis.a158;

import irvine.oeis.FiniteSequence;

/**
 * A158240 Smallest number made up of n consecutive digits such that every k-digit substring <code>(k &lt;= n)</code> taken from the left is divisible by <code>k (k=1..n)</code>.
 * @author Georg Fischer
 */
public class A158240 extends FiniteSequence {

  /** Construct the sequence. */
  public A158240() {
    super(1, 10, 102, 3452, 24365, 123654, 7836542, 38165472, 381654720L, 3816547290L);
  }
}
