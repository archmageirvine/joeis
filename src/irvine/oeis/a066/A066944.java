package irvine.oeis.a066;

import irvine.math.z.Z;

/**
 * A066944 Numbers n such that gcd(prime(n+1) + 1, prime(n) + 1) = 10.
 * @author Sean A. Irvine
 */
public class A066944 extends A066940 {

  /** Construct the sequence. */
  public A066944() {
    super(Z.TEN);
  }
}
