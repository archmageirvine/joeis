package irvine.oeis.a073;
// manually deris/essent at 2022-04-27

import irvine.oeis.PrependSequence;
import irvine.oeis.a054.A054408;

/**
 * A073659 a(1) = 1; for n &gt; 1, a(n) is the smallest even number not already in the sequence such that a(1) + ... + a(n) is a prime.
 * @author Georg Fischer
 */
public class A073659 extends PrependSequence {

  /** Construct the sequence. */
  public A073659() {
    super(2, new A054408(), 1, 2);
  }
}
