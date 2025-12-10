package irvine.oeis.a391;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a009.A009112;
import irvine.oeis.a050.A050936;

/**
 * A391131 Areas of Pythagorean triangles that are sums of two or more consecutive primes.
 * @author Sean A. Irvine
 */
public class A391131 extends IntersectionSequence {

  /** Construct the sequence. */
  public A391131() {
    super(1, new A009112(), new A050936());
  }
}
