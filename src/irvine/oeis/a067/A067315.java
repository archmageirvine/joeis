package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a042.A042996;

/**
 * A067315 Numbers k such that binomial(k, floor(k/2)) is not divisible by k.
 * @author Sean A. Irvine
 */
public class A067315 extends ComplementSequence {

  /** Construct the sequence. */
  public A067315() {
    super(1, new A042996(), Z.ONE);
  }
}
