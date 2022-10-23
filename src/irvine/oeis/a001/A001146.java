package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001146 a(n) = 2^(2^n).
 * @author Sean A. Irvine
 */
public class A001146 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(1 << ++mN);
  }
}
