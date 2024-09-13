package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005185;

/**
 * A072140.
 * @author Sean A. Irvine
 */
public class A072231 extends Sequence1 {

  private long mN = 0;
  private final Sequence mA = new A005185();

  @Override
  public Z next() {
    return Z.valueOf(++mN * mN).divide(mA.next());
  }
}
