package irvine.oeis.a064;

import irvine.math.cr.CR;
import irvine.oeis.cons.BeattySequence;

/**
 * A064679 A Beatty sequence for 10*i^i.
 * @author Sean A. Irvine
 */
public class A064679 extends BeattySequence {

  private static CR cr() {
    final CR a = CR.HALF_PI.negate().exp().multiply(10);
    return a.divide(a.subtract(CR.ONE));
  }

  /** Construct the sequence. */
  public A064679() {
    super(1, cr());
  }
}
