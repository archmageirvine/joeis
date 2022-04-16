package irvine.oeis.a056;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a029.A029972;
import irvine.oeis.a029.A029976;

/**
 * A056146 Palindromic primes in bases 4 and 8.
 * @author Sean A. Irvine
 */
public class A056146 extends IntersectionSequence {

  /** Construct the sequence. */
  public A056146() {
    super(new A029972(), new A029976());
  }
}
