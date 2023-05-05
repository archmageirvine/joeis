package irvine.oeis.a355;
// manually partsum at 2023-05-03 22:39

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a062.A062363;

/**
 * A355888 a(n) = Sum_{k=1..n} k! * floor(n/k).
 * @author Georg Fischer
 */
public class A355888 extends PartialSumSequence {

  /** Construct the sequence. */
  public A355888() {
    super(1, new A062363());
    next();
  }
}
