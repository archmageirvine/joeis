package irvine.oeis.a037;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A037087 Beatty sequence for e^(1/e).
 * @author Sean A. Irvine
 */
public class A037087 extends BeattySequence {

  private static final CR N = CR.E.inverse().exp();

  /** Construct the sequence. */
  public A037087() {
    super(0);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
