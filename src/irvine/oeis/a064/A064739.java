package irvine.oeis.a064;

import irvine.oeis.PrependSequence;
import irvine.oeis.a045.A045468;

/**
 * A064739 Primes p such that Fibonacci(p)-1 is divisible by p.
 * @author Sean A. Irvine
 */
public class A064739 extends PrependSequence {

  /** Construct the sequence. */
  public A064739() {
    super(1, new A045468(), 2);
  }
}

