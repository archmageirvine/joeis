package irvine.oeis.a064;

import irvine.math.cr.CR;
import irvine.oeis.cons.BeattySequence;

/**
 * A064724 A Beatty sequence for 2^sqrt(2).
 * @author Sean A. Irvine
 */
public class A064724 extends BeattySequence {

  private static CR build() {
    final CR a = CR.TWO.pow(CR.SQRT2);
    return a.divide(a.subtract(CR.ONE));
  }

  /** Construct the sequence. */
  public A064724() {
    super(1, build());
  }
}
