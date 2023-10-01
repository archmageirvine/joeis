package irvine.oeis.a066;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;

/**
 * A066077 a(n) is the number of x such that sigma(x)-1 is 0 or one of the first n-1 primes.
 * @author Sean A. Irvine
 */
public class A066077 extends PartialSumSequence {

  /** Construct the sequence. */
  public A066077() {
    super(1, new PrependSequence(new A066075(), 1));
  }
}
