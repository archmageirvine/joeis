package irvine.oeis.a389;

import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A389115 Primes p such that ord_p(2) = 2*r with r prime and 2*r &lt; p-1, where ord_p(2) = A014664(p).
 * @author Sean A. Irvine
 */
public class A389115 extends FilterSequence {

  /** Construct the sequence. */
  public A389115() {
    super(1, new A000040(), p -> {
      final Z ord = new IntegersModMul(p).order(Z.TWO);
      return !ord.isOdd() && ord.divide2().isProbablePrime() && ord.compareTo(p.subtract(1)) < 0;
    });
  }
}
