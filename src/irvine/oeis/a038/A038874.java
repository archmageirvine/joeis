package irvine.oeis.a038;
// Pattern manually modified

import irvine.oeis.PrependSequence;

/**
 * A038874 Primes p such that 3 is a square mod p.
 * @author Georg Fischer
 */
public class A038874 extends PrependSequence {

  /**
   * Construct the sequence.
   */
  public A038874() {
    super(new A038873(3, true), 2);
  }
}
