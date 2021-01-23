package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A001951 A Beatty sequence: a(n) = floor(n*sqrt(2)).
 * @author Sean A. Irvine
 */
public class A001951 extends BeattySequence {

  /** Construct the sequence. */
  public A001951() {
    super(0);
  }

  @Override
  protected CR getCR() {
    return CR.SQRT2;
  }
}
