package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A001858.
 * @author Sean A. Irvine
 */
public class A001858 implements Sequence {

  private final ArrayList<Z> mSeq = new ArrayList<>();

  @Override
  public Z next() {
    final int n = mSeq.size();
    if (n == 0) {
      mSeq.add(Z.ONE);
    } else {
      Z s = Z.ZERO;
      for (int j = 0; j < n; ++j) {
        Z t = Binomial.binomial(n - 1, j).multiply(mSeq.get(n - 1 - j));
        if (j > 1) {
          t = t.multiply(Z.valueOf(j + 1).pow(j - 1));
        }
        s = s.add(t);
      }
      mSeq.add(s);
    }
    return mSeq.get(n);
  }
}
