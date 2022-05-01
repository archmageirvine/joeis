package irvine.oeis.a243;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A243657 Zeroless factorials: a(0)=1; thereafter a(n) = noz(n*a(n-1)), where noz(n) = A004719(n) omits the zeros from n.
 * @author Georg Fischer
 */
public class A243657 implements Sequence {

  private Z mA = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    final Z result = mA;
    ++mN;
    mA = new Z(mA.multiply(mN).toString().replace("0", ""));
    return result;

  }
}
