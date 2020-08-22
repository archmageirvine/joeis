package irvine.oeis.a022;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001222;

/**
 * A022559 Sum of exponents in prime-power factorization of n!.
 * @author Sean A. Irvine
 */
public class A022559 extends PartialSumSequence {

  /** Construct the sequence. */
  public A022559() {
    super(new PrependSequence(new A001222(), 0));
  }
}

