package irvine.oeis.a064;

import irvine.math.cr.CR;
import irvine.oeis.cons.BeattySequence;

/**
 * A064720 A Beatty sequence for 3^i + 3^-i + 1.
 * @author Sean A. Irvine
 */
public class A064720 extends BeattySequence {

  private static CR build() {
    final CR a = CR.TWO.multiply(CR.THREE.log().cos());
    return a.add(CR.ONE).divide(a);
  }

  /** Construct the sequence. */
  public A064720() {
    super(1, build());
  }
}
