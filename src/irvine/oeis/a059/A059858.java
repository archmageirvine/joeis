package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a040.A040159;

/**
 * A059858 Primes p such that x^5 == 2 (mod p) has five solutions.
 * @author Sean A. Irvine
 */
public class A059858 extends FilterSequence {

  /** Construct the sequence. */
  public A059858() {
    super(new A040159(), k -> k.mod(5) == 1 && Z.TWO.modPow(k.subtract(1).divide(5), k).equals(Z.ONE));
  }
}
