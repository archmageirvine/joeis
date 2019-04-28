package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009994 Numbers with digits in nondecreasing order.
 * @author Sean A. Irvine
 */
public class A009994 implements Sequence {

//  private final TreeSet<Z> mSeq = new TreeSet<>();
//  {
//    mSeq.add(Z.ZERO);
//  }
//
//  @Override
//  public Z nextQ() {
//    final Z t = mSeq.pollFirst();
//    final long r = t.mod(10);
//    final Z u = t.multiply(10);
//    for (long k = Math.max(1, r); k < 10; ++k) {
//      mSeq.add(u.add(k));
//    }
//    return t;
//  }

  private long mN = -1;

  @Override
  public Z next() {
    if (mN == -1) {
      mN = 0;
    } else {
      int g = 0;
      while ((mN % 10) == 9) {
        ++g;
        mN /= 10;
      }
      ++mN;
      final long last = mN % 10;
      while (g-- > 0) {
        mN *= 10;
        mN += last;
      }
    }
    return Z.valueOf(mN);
  }
}
