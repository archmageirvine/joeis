package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010062 <code>a(0)=1;</code> thereafter <code>a(n+1) = a(n) +</code> number of <code>1</code>'s in binary representation of <code>a(n)</code>.
 * @author Sean A. Irvine
 */
public class A010062 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(mA.bitCount());
    return mA;
  }
}

