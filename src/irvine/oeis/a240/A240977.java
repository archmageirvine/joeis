package irvine.oeis.a240;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.BeattySequence;

/**
 * A240977 Beatty sequence for cube root of Pi: a(n) = floor(n*Pi^(1/3)).
 * @author Georg Fischer
 */
public class A240977 extends BeattySequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.pow(CR.PI, CR.THREE.inverse());

  /** Construct the sequence. */
  public A240977() {
    super(0);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
