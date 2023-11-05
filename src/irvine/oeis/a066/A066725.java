package irvine.oeis.a066;

import irvine.math.z.ZUtils;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A066725 Primes p the product of whose digits increased by one is prime.
 * @author Sean A. Irvine
 */
public class A066725 extends FilterSequence {

  /** Construct the sequence. */
  public A066725() {
    super(1, new A000040(), k -> ZUtils.digitProduct(k).add(1).isProbablePrime());
  }
}
