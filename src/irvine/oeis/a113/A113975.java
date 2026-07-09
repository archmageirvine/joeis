package irvine.oeis.a113;

import irvine.math.z.Z;
import irvine.oeis.gf.GfSequence;

/**
 * A113975 Absolute value of the n-th coefficient in the expansion of the generating function (2-7*x-x^2) / (1-x).
 * @author Sean A. Irvine
 */
public class A113975 extends GfSequence {

  /** Construct the sequence. */
  public A113975() {
    super(0, "(2-7*x-x^2)/(1-x)");
  }

  @Override
  public Z next() {
    return super.next().abs();
  }
}
