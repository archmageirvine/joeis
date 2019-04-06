package irvine.oeis.a235;

import irvine.oeis.FiniteSequence;

/**
 * A235597 Squares in which each digit exceeds the previous digit by more than one.
 * @author Georg Fischer
 */
public class A235597 extends FiniteSequence {

  /** Construct the sequence. */
  public A235597() {
    super(0, 1, 4, 9, 16, 25, 36, 49, 169, 1369);
  }
}
