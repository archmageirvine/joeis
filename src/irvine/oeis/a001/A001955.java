package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A001955.
 * @author Sean A. Irvine
 */
public class A001955 extends BeattySequence {

  private static final CR N = CR.ONE.add(CR.valueOf(11).sqrt().inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
