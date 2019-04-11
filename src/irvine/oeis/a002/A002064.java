package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002064 Cullen numbers: <code>n*2^n + 1</code>.
 * @author Sean A. Irvine
 */
public class A002064 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).shiftLeft(mN).add(1);
  }
}

