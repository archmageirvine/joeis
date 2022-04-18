package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;

/**
 * A026550 a(n) = Sum_{i=0..n} Sum_{j=0..i} T(i,j), T given by A026536.
 * @author Sean A. Irvine
 */
public class A026550 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026550() {
    super(new A026548());
  }
}
