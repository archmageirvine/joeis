package irvine.oeis.a392;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a270.A270593;

/**
 * A392286 a(n) = Sum_{k=1..n} binomial(n+1, k+1)*A000272(k).
 * @author Sean A. Irvine
 */
public class A392286 extends PartialSumSequence {

  /** Construct the sequence. */
  public A392286() {
    super(0, new A270593());
  }
}
