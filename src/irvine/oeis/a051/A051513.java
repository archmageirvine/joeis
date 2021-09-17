package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051513 a(n) = min { 2^n, floor(100/n) }.
 * @author Sean A. Irvine
 */
public class A051513 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN <= 4 ? Z.ONE.shiftLeft((int) mN) : Z.valueOf(100 / mN);
  }
}

