package irvine.oeis.a022;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000196;

/**
 * A022554 a(n) = Sum_{k=0..n} floor(sqrt(k)).
 * @author Sean A. Irvine
 */
public class A022554 extends PartialSumSequence {

  /** Construct the sequence. */
  public A022554() {
    super(new A000196());
  }
}

