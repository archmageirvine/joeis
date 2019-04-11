package irvine.oeis.a179;

import irvine.oeis.FiniteSequence;

/**
 * A179507 Smallest emirp with a base-10 digit set of <code>{0,1,</code>..,n}.
 * @author Georg Fischer
 */
public class A179507 extends FiniteSequence {

  /** Construct the sequence. */
  public A179507() {
    super(10011101, 1021, 10321, 102043, 1015423, 10224563, 10243657, 1012356487L, 10124389567L);
  }
}
