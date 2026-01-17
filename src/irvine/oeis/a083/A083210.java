package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A083210 Numbers with no subset of their divisors such that the complement has the same sum.
 * @author Sean A. Irvine
 */
public class A083210 extends ComplementSequence {

  /** Construct the sequence. */
  public A083210() {
    super(1, Z.ONE, new A083207());
  }
}
