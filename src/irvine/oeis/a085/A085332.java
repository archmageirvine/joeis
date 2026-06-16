package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a003.A003325;

/**
 * A085332 Prime powers that are sums of two positive cubes.
 * @author Sean A. Irvine
 */
public class A085332 extends FilterSequence {

  /** Construct the sequence. */
  public A085332() {
    super(1, new A003325(), Predicates.PRIME_POWER::is);
  }
}
