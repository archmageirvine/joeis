package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051513 a(n) = min { 2^n, floor(100/n) }.
 * @author Sean A. Irvine
 */
public class A051513 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN <= 4 ? Z.ONE.shiftLeft(mN) : Z.valueOf(100 / mN);
  }
}

