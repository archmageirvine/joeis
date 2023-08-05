package irvine.oeis.a064;

import irvine.math.cr.CR;
import irvine.oeis.cons.BeattySequence;

/**
 * A064996 A Beatty sequence: [Pi^2 -8].
 * @author Sean A. Irvine
 */
public class A064996 extends BeattySequence {

  /** Construct the sequence. */
  public A064996() {
    super(1, CR.PI.square().subtract(CR.EIGHT));
  }
}
