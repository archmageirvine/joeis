package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a065.A065091;

/**
 * A081762 Primes p such that p*(p-2) divides 2^(p-1)-1.
 * @author Sean A. Irvine
 */
public class A081762 extends FilterSequence {

  /** Construct the sequence. */
  public A081762() {
    super(1, new A065091(), p -> Z.TWO.modPow(p.subtract(1), p.multiply(p.subtract(2))).isOne());
  }
}

