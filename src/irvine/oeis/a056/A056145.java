package irvine.oeis.a056;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a016.A016041;
import irvine.oeis.a029.A029976;

/**
 * A056145 Palindromic primes in bases 2 and 8.
 * @author Sean A. Irvine
 */
public class A056145 extends IntersectionSequence {

  /** Construct the sequence. */
  public A056145() {
    super(new A016041(), new A029976());
  }
}
