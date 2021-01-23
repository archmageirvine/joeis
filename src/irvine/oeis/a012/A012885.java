package irvine.oeis.a012;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A012885 Suffixes of 357686312646216567629137 (all primes).
 * @author Sean A. Irvine
 */
public class A012885 extends FiniteSequence {

  private static Z[] build() {
    final String s = "357686312646216567629137";
    final Z[] res = new Z[s.length()];
    for (int k = 0; k < s.length(); ++k) {
      res[k] = new Z(s.substring(s.length() - k - 1));
    }
    return res;
  }

  /** Construct the sequence. */
  public A012885() {
    super(build());
  }
}
