package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030467 Numbers n such that n^2 is a concatenation of two successive numbers.
 * @author Sean A. Irvine
 */
public class A030467 extends A030466 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
