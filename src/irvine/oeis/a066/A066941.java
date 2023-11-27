package irvine.oeis.a066;

import irvine.math.z.Z;

/**
 * A066941 Numbers n such that gcd(prime(n+1) + 1, prime(n) + 1) = 4.
 * @author Sean A. Irvine
 */
public class A066941 extends A066940 {

  /** Construct the sequence. */
  public A066941() {
    super(Z.FOUR);
  }
}
