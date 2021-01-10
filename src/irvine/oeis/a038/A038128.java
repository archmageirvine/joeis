package irvine.oeis.a038;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A038128 Beatty sequence for Euler's constant (A001620).
 * @author Sean A. Irvine
 */
public class A038128 extends BeattySequence {

  /** Construct the sequence. */
  public A038128() {
    super(0);
  }

  @Override
  protected CR getCR() {
    return CR.GAMMA;
  }
}
