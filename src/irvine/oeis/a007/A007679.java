package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007679 If <code>n mod 4 = 0</code> then <code>2^(n-1)+1</code> elif <code>n mod 4 = 2</code> then <code>2^(n-1)-1</code> else <code>2^(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A007679 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(mN).add((1 - (++mN & 1)) * (1 - (mN & 2)));
  }
}
