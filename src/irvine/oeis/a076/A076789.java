package irvine.oeis.a076;

import irvine.factor.prime.Puma;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a001.A001622;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A076789 Phisumprimes: prime(k), where k is the sum of the first n digits of phi-1 and phi is the golden ratio.
 * @author Sean A. Irvine
 */
public class A076789 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A076789() {
    super(1, new PartialSumSequence(new A001622().skip()), Puma::primeZ);
  }
}
