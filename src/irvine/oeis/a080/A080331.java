package irvine.oeis.a080;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a002.A002858;

/**
 * A080331 Index in A002858 of the larger of the two Ulam numbers that sum to the n-th Ulam number.
 * @author Sean A. Irvine
 */
public class A080331 extends A002858 {

  private final HashSet<Z> mUlam = new HashSet<>();
  private int mN = 0;

  @Override
  public Z next() {
    final Z t = super.next();
    mUlam.add(t);
    if (mN < 2) {
      ++mN;
      return Z.ZERO;
    } else {
      for (int k = mSeq.size() - 1; k >= 0; --k) {
        if (mUlam.contains(t.subtract(mSeq.get(k)))) {
          return Z.valueOf(k + 1);
        }
      }
    }
    throw new RuntimeException();
  }
}

