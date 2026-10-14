package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A086879 Number of symmetric singular n X n matrices over GF(2).
 * @author Sean A. Irvine
 */
public class A086879 extends Sequence1 {

  private final Sequence mS = new A086812().skip();
  private long mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN * (mN + 1) / 2).subtract(mS.next());
  }
}
