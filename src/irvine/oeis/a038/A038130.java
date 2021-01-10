package irvine.oeis.a038;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A038130 Beatty sequence for 2*Pi.
 * @author Sean A. Irvine
 */
public class A038130 extends BeattySequence {

  /** Construct the sequence. */
  public A038130() {
    super(0);
  }

  @Override
  protected CR getCR() {
    return CR.TAU;
  }
}
