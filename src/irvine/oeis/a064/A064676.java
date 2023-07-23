package irvine.oeis.a064;

import irvine.math.cr.CR;
import irvine.oeis.cons.BeattySequence;

/**
 * A064676 A Beatty sequence for 10*i^i.
 * @author Sean A. Irvine
 */
public class A064676 extends BeattySequence {

  /** Construct the sequence. */
  public A064676() {
    super(1, CR.HALF_PI.negate().exp().multiply(10));
  }
}
