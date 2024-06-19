package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070869 a(1) = 16; a(n+1) = sum of a(n) and (a(n) written in base 2 and reversed).
 * @author Sean A. Irvine
 */
public class A070869 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(16) : mA.add(Functions.REVERSE.z(2, mA));
    return mA;
  }
}
