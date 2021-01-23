package irvine.oeis.a038;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.BeattySequence;

/**
 * A038129 Beatty sequence for cube root of 2.
 * @author Sean A. Irvine
 */
public class A038129 extends BeattySequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.TWO, CR.ONE_THIRD);

  /** Construct the sequence. */
  public A038129() {
    super(0);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
