package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030295 Cubes with at most three distinct digits.
 * @author Sean A. Irvine
 */
public class A030295 extends A030294 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
