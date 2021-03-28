package irvine.oeis.a045;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a002.A002375;

/**
 * A045917 From Goldbach problem: number of decompositions of 2n into unordered sums of two primes.
 * @author Sean A. Irvine
 */
public class A045917 extends PrependSequence {

  /** Construct the sequence. */
  public A045917() {
    super(new SkipSequence(new A002375(), 2), 0, 1);
  }
}
