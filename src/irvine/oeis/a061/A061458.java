package irvine.oeis.a061;

import irvine.math.z.ZUtils;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000578;

/**
 * A061458 Cubes whose digit reversal is also a cube.
 * @author Sean A. Irvine
 */
public class A061458 extends FilterSequence {

  /** Construct the sequence. */
  public A061458() {
    super(new A000578(), k -> ZUtils.isCube(ZUtils.reverse(k)));
  }
}

