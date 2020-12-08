package irvine.oeis.a037;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A037085 Beatty sequence for Pi^2.
 * @author Sean A. Irvine
 */
public class A037085 extends BeattySequence {

  private static final CR PI2 = CR.PI.multiply(CR.PI);

  /** Construct the sequence. */
  public A037085() {
    super(0);
  }

  @Override
  protected CR getCR() {
    return PI2;
  }
}
