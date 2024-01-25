package irvine.oeis.a068;

import irvine.math.z.ZUtils;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000217;

/**
 * A068071.
 * @author Sean A. Irvine
 */
public class A068071 extends FilterSequence {

  /** Construct the sequence. */
  public A068071() {
    super(1, new A000217().skip(), k -> ZUtils.isTriangular(ZUtils.rotateRight(k)));
  }
}

