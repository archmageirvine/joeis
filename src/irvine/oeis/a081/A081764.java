package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a065.A065091;

/**
 * A081764 Primes p such that p*(p-2) divides 3^(p-1)-1.
 * @author Sean A. Irvine
 */
public class A081764 extends FilterSequence {

  /** Construct the sequence. */
  public A081764() {
    super(1, new A065091(), p -> Z.THREE.modPow(p.subtract(1), p.multiply(p.subtract(2))).isOne());
  }
}

