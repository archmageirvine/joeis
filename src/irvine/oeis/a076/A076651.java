package irvine.oeis.a076;

import irvine.oeis.a001.A001359;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A076651 a(n) = floor( sqrt( p * (p+2) / 2)) where p is the lesser of the twin primes.
 * @author Sean A. Irvine
 */
public class A076651 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A076651() {
    super(1, new A001359(), p -> p.multiply(p.add(2)).divide2().sqrt());
  }
}
