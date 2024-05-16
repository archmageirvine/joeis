package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002808;
import irvine.util.array.DynamicArray;

/**
 * A068418.
 * @author Sean A. Irvine
 */
public class A069714 extends Sequence1 {

  private final Sequence mSeq = new PrependSequence(new A002808(), 2);
  private final DynamicArray<Z> mFirst = new DynamicArray<>();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirst.get(mN) == null) {
      final Z k = mSeq.next();
      final FactorSequence fs = Jaguar.factor(k);
      final Z[] qr = fs.sigma().subtract(k).divideAndRemainder(k.subtract(fs.phi()));
      if (qr[1].isZero()) {
        final int t = qr[0].intValueExact();
        if (mFirst.get(t) == null) {
          mFirst.set(t, k);
        }
      }
    }
    return mFirst.get(mN);
  }
}

