package irvine.oeis.a120;

import irvine.oeis.FiniteSequence;

/**
 * A120673 Least number including digits 1,2,...,n and divisible by each of 1,2,...,n.
 * @author Georg Fischer
 */
public class A120673 extends FiniteSequence {

  /** Construct the sequence. */
  public A120673() {
    super(1, FINITE, 1, 12, 132, 12324, 123540, 1234560, 122365740L, 123487560L, 1234759680L);
  }
}
