package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005277;

/**
 * A072416 a(1) = 2; a(n) = half of the a(n-1)-th even nontotient number.
 * @author Sean A. Irvine
 */
public class A072416 extends Sequence1 {

  private final Sequence mSeq = new A005277();
  private long mA = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (mA == 0) {
      mA = 2;
    } else {
      final long t = mA;
      while (mM != t) {
        mA = mSeq.next().longValueExact();
        ++mM;
      }
      mA /= 2;
    }
    return Z.valueOf(mA);
  }
}
