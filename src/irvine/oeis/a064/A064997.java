package irvine.oeis.a064;

import irvine.math.cr.CR;
import irvine.oeis.cons.BeattySequence;

/**
 * A064997 A Beatty sequence: [Pi^2 -8].
 * @author Sean A. Irvine
 */
public class A064997 extends BeattySequence {

  private static CR build() {
    final CR x = CR.PI.square();
    return x.subtract(CR.EIGHT).divide(x.subtract(CR.NINE));
  }

  /** Construct the sequence. */
  public A064997() {
    super(1, build());
  }
}
