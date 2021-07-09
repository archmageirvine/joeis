package irvine.oeis.a110;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A110117 a(n) = floor(n * (sqrt(2) + sqrt(3))).
 * @author Sean A. Irvine
 */
public class A110117 extends BeattySequence {

  /** Construct the sequence. */
  public A110117() {
    super(1, CR.SQRT2.add(CR.THREE.sqrt()));
  }
}
