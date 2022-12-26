package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000009;
import irvine.oeis.a000.A000041;

/**
 * A060744 Numbers n such that n | p(n)*q(n), where p() is the unrestricted partition function (A000041) and q is the distinct partition function (A000009).
 * @author Sean A. Irvine
 */
public class A060744 extends Sequence1 {

  private int mN = 0;
  private final Sequence mA = new A000041();
  private final Sequence mB = new A000009();

  {
    mA.next();
    mB.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.next().multiply(mB.next());
      if (t.mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
