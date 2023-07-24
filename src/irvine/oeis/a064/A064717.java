package irvine.oeis.a064;

import irvine.math.cr.CR;
import irvine.oeis.cons.BeattySequence;

/**
 * A064717 A Beatty sequence for 2^i + 2^(-i) where i = sqrt(-1).
 * @author Sean A. Irvine
 */
public class A064717 extends BeattySequence {

  /** Construct the sequence. */
  public A064717() {
    super(1, CR.TWO.multiply(CR.TWO.log().cos()));
  }
}
