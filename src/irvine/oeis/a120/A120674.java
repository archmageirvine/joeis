package irvine.oeis.a120;

import irvine.oeis.FiniteSequence;

/**
 * A120674 Least number with distinct digits including digits 1,2,...,n and divisible by each of 1,2,...,n.
 * @author Georg Fischer
 */
public class A120674 extends FiniteSequence {

  /** Construct the sequence. */
  public A120674() {
    super(1, 12, 132, 12348, 123540, 1234560, 123487560L, 123487560L, 1234759680L);
  }
}
