package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000142 Factorial numbers: <code>n! = 1*2*3*4*...*n (order</code> of symmetric group <code>S_n</code>, number of permutations of <code>n letters)</code>.
 * @author Sean A. Irvine
 */
public class A000142 implements Sequence {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return mF;
  }
}

