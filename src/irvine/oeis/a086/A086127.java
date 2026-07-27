package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A086127 Numbers k such that k remains prime after five iteration of function f(j) = 14*f(j)+1, starting at f(1) = prime.
 * @author Sean A. Irvine
 */
public class A086127 extends FilterSequence {

  /** Construct the sequence. */
  public A086127() {
    super(1, new A000040(), A086127::is);
  }

  private static boolean is(Z t) {
    for (long k = 0; k < 5; ++k) {
      t = t.multiply(14).add(1);
      if (!t.isProbablePrime()) {
        return false;
      }
    }
    return true;
  }
}

