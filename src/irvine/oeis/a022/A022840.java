package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A022840 Beatty sequence for sqrt(6).
 * @author Sean A. Irvine
 */
public class A022840 extends BeattySequence {

  private static final CR N = CR.SIX.sqrt();

  @Override
  protected CR getCR() {
    return N;
  }
}
