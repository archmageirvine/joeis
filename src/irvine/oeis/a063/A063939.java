package irvine.oeis.a063;

import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001125;

/**
 * A063939 Numbers p from A001125 such that 2*p-3 is prime.
 * @author Sean A. Irvine
 */
public class A063939 extends FilterSequence {

  /** Construct the sequence. */
  public A063939() {
    super(new A001125(), p -> p.multiply2().subtract(3).isProbablePrime());
  }
}
