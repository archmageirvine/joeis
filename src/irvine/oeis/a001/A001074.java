package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001074 Numbers m such that Sum_{k=0..m-1} exp(2*Pi*i*k^3/m) != 0.
 * @author Sean A. Irvine
 */
public class A001074 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      double sum = 0;
      for (int k = 0; k < mN; ++k) {
        sum += Math.cos(2.0 * k * k * k * Math.PI / mN);
      }
      sum = Math.abs(sum);
      //System.out.println(mN + " " + mSum);
      if (sum > 0.01) {
        if (sum < 0.2) {
          throw new UnsupportedOperationException();
        }
        return Z.valueOf(mN);
      }
    }
  }
}

