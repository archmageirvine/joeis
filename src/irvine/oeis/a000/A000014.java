package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001678;
import irvine.oeis.a059.A059123;

/**
 * A000014 Number of series-reduced trees with n nodes.
 * @author Sean A. Irvine
 */
public class A000014 extends Sequence0 {

  private final A059123 mA59123 = new A059123();
  private final A001678 mA1678 = new A001678();
  private final ArrayList<Z> mSeqF = new ArrayList<>();
  private final ArrayList<Z> mSeqG = new ArrayList<>();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mSeqG.add(mA1678.next()); // 0
      mSeqG.add(mA1678.next()); // 0
      mSeqG.add(mA1678.next()); // x^2
      mSeqG.add(mA1678.next()); // 0
      mSeqF.add(mA59123.next());
      mSeqF.add(mA59123.next());
      return Z.ZERO;
    }
    mSeqG.add(mA1678.next());
    mSeqF.add(mA59123.next());
    Z r = mSeqG.get(mN + 1).add(mSeqG.get(mN + 2))
      .add(mSeqF.get(mN)).subtract(mSeqF.get(mN + 1));

    for (int k = 2; k <= mN + 2; ++k) {
      r = r.subtract(mSeqG.get(k).multiply(mSeqG.get(mN + 2 - k)));
    }
    return r;
  }
}

