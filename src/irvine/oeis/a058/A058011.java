package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.a057.A057809;

/**
 * A058011 Consider the sequence {b(m)} of nonprimes; sequence gives values of m where gcd{m, b(m)} increases.
 * @author Sean A. Irvine
 */
public class A058011 extends PrependSequence {

  /** Construct the sequence. */
  public A058011() {
    super(new A057809().skip(1), 1);
  }
}
