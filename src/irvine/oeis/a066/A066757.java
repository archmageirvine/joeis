package irvine.oeis.a066;

import irvine.math.z.ZUtils;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000326;

/**
 * A066757 Pentagonal numbers not divisible by 10 whose reverse is triangular.
 * @author Sean A. Irvine
 */
public class A066757 extends FilterSequence {

  /** Construct the sequence. */
  public A066757() {
    super(1, new A000326(), k -> k.isZero() || (k.mod(10) != 0 && ZUtils.isTriangular(ZUtils.reverse(k))));
  }
}

