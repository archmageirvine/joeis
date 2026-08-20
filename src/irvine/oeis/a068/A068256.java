package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.triangle.DirectArray;

/**
 * A068256 1/6 the number of colorings of an n X n square array with 6 colors.
 * @author Sean A. Irvine
 */
public class A068256 extends A068255 implements DirectArray {

  /** Construct the sequence. */
  public A068256() {
    super(6);
  }

  @Override
  public Z a(final long n, final long k) {
    return t((int) n, (int) k);
  }

}
