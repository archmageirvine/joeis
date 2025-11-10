package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A081763 Primes p such that p*(p-1) divides 3^(p-1)-1.
 * @author Sean A. Irvine
 */
public class A081763 extends FilterSequence {

  /** Construct the sequence. */
  public A081763() {
    super(1, new A000040(), p -> Z.THREE.modPow(p.subtract(1), p.multiply(p.subtract(1))).isOne());
  }
}

