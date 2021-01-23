package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A022843 Beatty sequence for e: a(n) = floor(n*e).
 * @author Sean A. Irvine
 */
public class A022843 extends BeattySequence {

  /** Construct the sequence. */
  public A022843() {
    super(0);
  }

  @Override
  protected CR getCR() {
    return CR.E;
  }
}
