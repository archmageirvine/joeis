package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054047 Numbers which can be read as (possibly different) numbers when rotated by 180 degrees *final zeros allowed).
 * @author Sean A. Irvine
 */
public class A054047 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return new Z(Long.toString(++mN, 5).replace('4', '9').replace('3', '8').replace('2', '6'));
  }
}
