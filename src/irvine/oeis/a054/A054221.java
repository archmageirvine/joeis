package irvine.oeis.a054;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Triple;

/**
 * A054221 Consider all integer triples (i,j,k), j,k&gt;0, with binomial(i+2,3)=binomial(j+2,3)+k^3, ordered by increasing i; sequence gives i values.
 * @author Sean A. Irvine
 */
public class A054221 implements Sequence {

  // After Bert Dobbelaere

  private final List<Triple<Long>> mA = new ArrayList<>();
  private long mI = 0;
  private int mM = 0;
  private long mTi = 0;

  protected long select(final Triple<Long> t) {
    return t.left();
  }

  @Override
  public Z next() {
    if (mM >= mA.size()) {
      mA.clear();
      mM = 0;
      while (mA.isEmpty()) {
        long j = mI;
        ++mI;
        long k = 1;
        long kd2 = 1;
        long kd3 = 0;
        long tj = mTi;
        long delta = tj + j;
        mTi += mI;
        while (j > 0) {
          if (delta > 0) {
            kd3 += 6;
            kd2 += kd3;
            delta -= kd2;
            ++k;
          } else {
            if (delta == 0) {
              mA.add(new Triple<>(mI, j, k));
            }
            delta += tj;
            tj -= j;
            --j;
          }
        }
      }
    }
    return Z.valueOf(select(mA.get(mM++)));
  }
}
