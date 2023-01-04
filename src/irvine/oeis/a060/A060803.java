package irvine.oeis.a060;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a001.A001146;

/**
 * A060803 a(n) = Sum_{k=0..n} 2^(2^k).
 * @author Sean A. Irvine
 */
public class A060803 extends PartialSumSequence {

  /** Construct the sequence. */
  public A060803() {
    super(new A001146());
  }
}
