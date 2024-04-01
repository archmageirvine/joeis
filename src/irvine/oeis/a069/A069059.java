package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a014.A014567;

/**
 * A069059 Numbers k such that k and sigma(k) are not relatively prime.
 * @author Sean A. Irvine
 */
public class A069059 extends ComplementSequence {

  /** Construct the sequence. */
  public A069059() {
    super(1, new A014567(), Z.ONE);
  }
}

