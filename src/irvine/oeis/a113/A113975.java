package irvine.oeis.a113;

import irvine.math.z.Z;
import irvine.oeis.gf.GfSequence;

/**
 * A113975 Devil's Farey: coefficient expansion of a quadratic over quadratic that has 123 roots and a Farey p[1/2]=1 ( correction).
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
