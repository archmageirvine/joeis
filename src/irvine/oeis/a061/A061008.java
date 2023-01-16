package irvine.oeis.a061;

import irvine.oeis.PartialSumSequence;

/**
 * A061008 a(n) = Sum_{j=1..n} (-(n-1)! mod n).
 * @author Sean A. Irvine
 */
public class A061008 extends PartialSumSequence {

  /** Construct the sequence. */
  public A061008() {
    super(1, new A061007());
  }
}
