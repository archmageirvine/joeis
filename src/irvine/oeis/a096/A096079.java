package irvine.oeis.a096;
// manually robots/union2 at 2023-08-15 15:43

import irvine.oeis.UnionSequence;
import irvine.oeis.a050.A050795;
import irvine.oeis.a050.A050796;

/**
 * A096079 Near hypotenuse numbers, i.e., n such that n^2 -+ 1 = a^2 + b^2, with a, b &gt; 1.
 * @author Georg Fischer
 */
public class A096079 extends UnionSequence {

  /** Construct the sequence. */
  public A096079() {
    super(1, new A050795(), new A050796().skip(1));
  }
}
