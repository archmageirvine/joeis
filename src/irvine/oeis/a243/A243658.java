package irvine.oeis.a243;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A243658 a(0)=0; thereafter a(n) = noz(n+a(n-1)), where noz(n) = A004719(n).
 * @author Georg Fischer
 */
public class A243658 implements Sequence {

  private int mN = -1;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mA = new Z(mA.add(mN).toString().replace("0", ""));
    return mA;
  }
}
