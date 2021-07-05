package irvine.oeis.a048;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048793 List giving all subsets of natural numbers arranged in standard statistical (or Yates) order.
 * @author Sean A. Irvine
 */
public class A048793 implements Sequence {

  // After Alois P. Heinz

  private final ArrayList<Long> mA = new ArrayList<>();
  private long mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mA.size()) {
      mA.clear();
      if (++mN == 0) {
        return Z.ZERO;
      } else {
        long k = 0;
        long m = mN;
        while (m != 0) {
          ++k;
          if ((m & 1) == 1) {
            mA.add(k);
          }
          m >>>= 1;
        }
      }
      mM = 0;
    }
    return Z.valueOf(mA.get(mM));
  }
}
