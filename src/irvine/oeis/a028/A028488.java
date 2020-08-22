package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a002.A002819;

/**
 * A028488 Numbers n such that summatory Liouville function L(n) (A002819) is zero.
 * @author Sean A. Irvine
 */
public class A028488 extends A002819 {

  private long mN = 0;
  {
    super.next(); // 0 could be added to this sequence
  }

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!Z.ZERO.equals(super.next()));
    return Z.valueOf(mN);
  }
}
