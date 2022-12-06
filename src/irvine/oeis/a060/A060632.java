package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060632 a(n) = 2^wt(floor(n/2)) (i.e., 2^A000120(floor(n/2)), or A001316(floor(n/2))).
 * @author Sean A. Irvine
 */
public class A060632 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(Integer.bitCount(++mN / 2));
  }
}
