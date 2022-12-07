package irvine.oeis.a151;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001316;
import irvine.oeis.a006.A006046;

/**
 * A151566 Leftist toothpicks (see Comments for definition).
 * @author Georg Fischer
 */
public class A151566 extends A006046 {

  private int mN = -1;
  private Z mA;
  private final Sequence mSeq = new A001316();

  @Override
  public Z next() {
    // a(2n) = 2*A006046(n), a(2n+1) = a(2n) + A001316(n) = 2*A006046(n) + A001316(n)
    ++mN;
    if ((mN & 1) == 0) {
      mA = super.next().multiply2();
      return mA;
    }
    return mA.add(mSeq.next());
  }
}
