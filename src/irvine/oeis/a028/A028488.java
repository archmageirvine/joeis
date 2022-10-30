package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a002.A002819;

/**
 * A028488 Numbers k such that the summatory Liouville function L(k) (A002819) is zero.
 * @author Sean A. Irvine
 */
public class A028488 extends A002819 {

  private long mN = 0;
  {
    setOffset(1);
    super.next(); // 0 could be added to this sequence
  }

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!super.next().isZero());
    return Z.valueOf(mN);
  }
}
