package irvine.oeis.a024;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a008.A008472;

/**
 * A024924 a(n) = Sum_{k=1..n} prime(k)*floor(n/prime(k)).
 * @author Sean A. Irvine
 */
public class A024924 extends PartialSumSequence {

  /** Construct the sequence. */
  public A024924() {
    super(new PrependSequence(new A008472(), 0));
  }
}
