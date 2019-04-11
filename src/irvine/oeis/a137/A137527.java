package irvine.oeis.a137;

import irvine.oeis.FiniteSequence;

/**
 * A137527 Lexicographically earliest subset of <code>{0,1,...,13^2+13}</code> that does not contain a nontrivial solution to 2a+b=2c+d <code>(mod 13^2+13+1).</code> Up to affine transformations, it is the unique such set with 11 elements.
 * @author Sean A. Irvine
 */
public class A137527 extends FiniteSequence {

  /** Construct the sequence. */
  public A137527() {
    super(0, 1, 4, 5, 16, 17, 132, 143, 144, 147, 148);
  }
}

