package irvine.oeis.a080;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a002.A002858;

/**
 * A080329 Larger of the two Ulam numbers that sum to the n-th Ulam number.
 * @author Sean A. Irvine
 */
public class A080329 extends A002858 {

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
      for (final Z v : mSeq) {
        if (mUlam.contains(t.subtract(v))) {
          return t.subtract(v);
        }
      }
    }
    throw new RuntimeException();
  }
}

