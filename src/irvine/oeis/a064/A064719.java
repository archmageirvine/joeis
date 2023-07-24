package irvine.oeis.a064;

import irvine.math.cr.CR;
import irvine.oeis.cons.BeattySequence;

/**
 * A064719 A Beatty sequence for 3^i + 3^-i + 1.
 * @author Sean A. Irvine
 */
public class A064719 extends BeattySequence {

  /** Construct the sequence. */
  public A064719() {
    super(1, CR.TWO.multiply(CR.THREE.log().cos()).add(CR.ONE));
  }
}
