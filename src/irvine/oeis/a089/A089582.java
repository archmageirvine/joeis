package irvine.oeis.a089;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a036.A036262;

/**
 * A089582 From Gilbreath's conjecture.
 * @author Sean A. Irvine
 */
public class A089582 extends Sequence1 {

  private final Sequence mS = new A036262().skip(3);
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k < mN; ++k) {
      mS.next();
    }
    return mS.next();
  }
}
