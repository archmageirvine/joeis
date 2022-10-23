package irvine.oeis.a285;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a006.A006519;

/**
 * A285326 a(0) = 0, for n &gt; 0, a(n) = n + A006519(n).
 * @author Georg Fischer
 */
public class A285326 extends Sequence0 {

  private final Sequence mA = new A006519();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    return mA.next().add(mN);
  }
}
