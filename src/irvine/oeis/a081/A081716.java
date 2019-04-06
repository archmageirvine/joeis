package irvine.oeis.a081;

import irvine.oeis.FiniteSequence;

/**
 * A081716 Smallest number x such that phi(x)=A000010(x) has exactly n different decimal digits.
 * @author Georg Fischer
 */
public class A081716 extends FiniteSequence {

  /** Construct the sequence. */
  public A081716() {
    super(2, 11, 103, 1033, 10247, 102359, 1023487, 10234759, 102345979L, 1023475969L);
  }
}
