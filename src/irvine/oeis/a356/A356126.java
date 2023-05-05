package irvine.oeis.a356;
// manually partsum at 2023-05-03 22:39

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a281.A281372;

/**
 * A356126 a(n) = Sum_{k=1..n} k * sigma_3(k).
 * @author Georg Fischer
 */
public class A356126 extends PartialSumSequence {

  /** Construct the sequence. */
  public A356126() {
    super(1, new A281372());
    next();
  }
}
