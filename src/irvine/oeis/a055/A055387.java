package irvine.oeis.a055;

import irvine.oeis.PrependSequence;
import irvine.oeis.a225.A225035;

/**
 * A055387 2, 3, 5, 7, together with primes such that there is a nontrivial rearrangement of the digits which is a prime.
 * @author Sean A. Irvine
 */
public class A055387 extends PrependSequence {

  /** Construct the sequence. */
  public A055387() {
    super(1, new A225035(), 2, 3, 5, 7);
  }
}
