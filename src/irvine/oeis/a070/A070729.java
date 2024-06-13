package irvine.oeis.a070;

import irvine.oeis.FiniteSequence;

/**
 * A070729 Common British Royal Mint coinage (in pence) from smallest physical size to largest, as of May 13 2002.
 * @author Sean A. Irvine
 */
public class A070729 extends FiniteSequence {

  /** Construct the sequence. */
  public A070729() {
    super(1, FINITE, 5, 1, 20, 100, 10, 2, 50, 200);
  }
}
