package irvine.oeis.a024;

import irvine.oeis.PartialSumSequence;

/**
 * A024560 a(n) = Sum_{k=1..n} floor(1/{k*sqrt(6)}) where {x} := x - floor(x).
 * @author Sean A. Irvine
 */
public class A024560 extends PartialSumSequence {

  /** Construct the sequence. */
  public A024560() {
    super(new A024559());
  }
}
