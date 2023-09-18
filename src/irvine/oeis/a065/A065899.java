package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002808;

/**
 * A065899 a(n) is the index of the n-th compositorial number, A036691(n), in the sequence of composites (A002808).
 * @author Sean A. Irvine
 */
public class A065899 extends A002808 {

  private final Sequence mC = new A002808();
  private long mM = 0;
  private Z mCompositorial = Z.ONE;

  @Override
  public Z next() {
    mCompositorial = mCompositorial.multiply(mC.next());
    while (true) {
      ++mM;
      if (mCompositorial.equals(super.next())) {
        return Z.valueOf(mM);
      }
    }
  }
}
