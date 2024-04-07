package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A069148 Numbers k such that k*k!/A062758(k) is not an integer where A062758(k) is the product of squares of divisors of k.
 * @author Sean A. Irvine
 */
public class A069148 extends ComplementSequence {

  /** Construct the sequence. */
  public A069148() {
    super(1, new A069149(), Z.ONE);
  }
}

