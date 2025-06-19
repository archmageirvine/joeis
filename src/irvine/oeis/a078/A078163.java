package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a051.A051201;

/**
 * A078163 a(n) = A051201(n^2).
 * @author Sean A. Irvine
 */
public class A078163 extends Sequence1 {

  private final DirectSequence mS = new A051201();
  private long mN = 0;

  @Override
  public Z next() {
    return mS.a(Z.valueOf(++mN).square());
  }
}
