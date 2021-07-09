package irvine.oeis.a000;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.BeattySequence;

/**
 * A000572 A Beatty sequence: [ n(e+1) ].
 * @author Sean A. Irvine
 */
public class A000572 extends BeattySequence {

  /** Construct the sequence. */
  public A000572() {
    super(1, ComputableReals.SINGLETON.exp(CR.ONE).add(CR.ONE));
  }
}
