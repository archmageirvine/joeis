package irvine.oeis.a037;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A037086 Beatty sequence for sqrt(Pi).
 * @author Sean A. Irvine
 */
public class A037086 extends BeattySequence {

  /** Construct the sequence. */
  public A037086() {
    super(0);
  }

  @Override
  protected CR getCR() {
    return CR.SQRT_PI;
  }
}
