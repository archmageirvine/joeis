package irvine.oeis.a027;

import irvine.oeis.PartialSumSequence;

/**
 * A027068 a(n) = Sum_{i=0..n} Sum_{j=i..2*i} A027052(i, j).
 * @author Sean A. Irvine
 */
public class A027068 extends PartialSumSequence {

  /** Construct the sequence. */
  public A027068() {
    super(new A027067());
  }
}
