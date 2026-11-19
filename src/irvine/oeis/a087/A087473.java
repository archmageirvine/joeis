package irvine.oeis.a087;

import irvine.oeis.InverseSequence;

/**
 * A087473 Smallest positive number that requires n iterations of f(k) to reach a single digit, where f(k) is the product of the two numbers formed from the alternating digits of k.
 * @author Sean A. Irvine
 */
public class A087473 extends InverseSequence {

  /** Construct the sequence. */
  public A087473() {
    super(0, 0, new A087472());
  }
}
