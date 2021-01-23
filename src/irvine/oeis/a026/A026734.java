package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;

/**
 * A026734 a(n) = Sum_{i=0..n} Sum_{j=0..n} T(i,j), T given by A026725.
 * @author Sean A. Irvine
 */
public class A026734 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026734() {
    super(new A026732());
  }
}
