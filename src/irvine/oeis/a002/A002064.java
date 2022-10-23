package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002064 Cullen numbers: a(n) = n*2^n + 1.
 * @author Sean A. Irvine
 */
public class A002064 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).shiftLeft(mN).add(1);
  }
}

