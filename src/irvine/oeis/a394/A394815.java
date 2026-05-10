package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a014.A014574;

/**
 * A394815 Numbers k in A014574 (averages of twin prime pairs) such that gcd(k, sigma(k)) = 2.
 * @author Sean A. Irvine
 */
public class A394815 extends FilterSequence {

  /** Construct the sequence. */
  public A394815() {
    super(1, new A014574(), k -> Functions.GCD.z(k, Functions.SIGMA1.z(k)).equals(Z.TWO));
  }
}
