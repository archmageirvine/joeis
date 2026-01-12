package irvine.oeis.a392;

import irvine.oeis.UnionSequence;

/**
 * A392047 Positive integers whose canonical prime factorization p_1^e_1*...*p_r^e_r satisfies that {p_1, ..., p_r, e_1, ..., e_r} is a set of 2*r consecutive integers.
 * @author Sean A. Irvine
 */
public class A392047 extends UnionSequence {

  /** Construct the sequence. */
  public A392047() {
    super(1, new A392045(), new A392046());
  }
}

