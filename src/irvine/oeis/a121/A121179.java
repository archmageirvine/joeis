package irvine.oeis.a121;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a001.A001764;

/**
 * A121179 Related to enumeration of alkane systems - see reference for precise definition.
 * a(n) = if n == 1 (mod 3) then (1/3) * A001764(n) + (2/3) * A001764((n-1)/3) else (1/3) * A001764(n) fi.
 * @author Georg Fischer
 */
public class A121179 extends A001764 {

  private long mN = -1;

  /** Construct the sequence. */
  public A121179() {
    setOffset(0);
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    } else {
      Q result = new Q(a1764(mN), Z.THREE);
      if (mN % 3 == 1) {
        result = result.add(new Q(Z.TWO.multiply(a1764((mN - 1) / 3)), Z.THREE));
      }
      return result.num();
    }
  }
}
