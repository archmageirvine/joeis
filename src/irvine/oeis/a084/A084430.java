package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A084430 Smallest prime with "n^3" as central digit(s).
 * @author Sean A. Irvine
 */
public class A084430 extends Sequence0 {

  private final DirectSequence mA = new A084413();
  private long mN = -1;

  @Override
  public Z next() {
    return mA.a(Z.valueOf(++mN).pow(3));
  }
}
