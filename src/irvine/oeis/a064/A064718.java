package irvine.oeis.a064;

import irvine.math.cr.CR;
import irvine.oeis.cons.BeattySequence;

/**
 * A064718 A Beatty sequence for 2^i + 2^-i where i = sqrt(-1).
 * @author Sean A. Irvine
 */
public class A064718 extends BeattySequence {

  private static CR build() {
    final CR a = CR.TWO.multiply(CR.TWO.log().cos());
    return a.divide(a.subtract(CR.ONE));
  }

  /** Construct the sequence. */
  public A064718() {
    super(1, build());
  }
}
