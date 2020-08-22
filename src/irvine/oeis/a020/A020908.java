package irvine.oeis.a020;

import java.util.ArrayList;
import java.util.Collections;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;

/**
 * A020908 Number of terms in Zeckendorf representation of 2^n.
 * @author Sean A. Irvine
 */
public class A020908 implements Sequence {

  private final A000045 mFiboSeq = new A000045();
  private final ArrayList<Z> mFibo = new ArrayList<>();
  private Z mN = null;
  {
    mFiboSeq.next();
    mFiboSeq.next();
    mFibo.add(mFiboSeq.next());
  }

  protected long base() {
    return 2;
  }

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(base());
    Z n = mN;
    while (n.compareTo(mFibo.get(mFibo.size() - 1)) > 0) {
      mFibo.add(mFiboSeq.next());
    }
    int b = Collections.binarySearch(mFibo, n);
    if (b >= 0) {
      return Z.ONE;
    }
    int c = 0;
    b = -b - 1;
    while (n.signum() > 0) {
      while (mFibo.get(b).compareTo(n) > 0) {
        --b;
      }
      n = n.subtract(mFibo.get(b));
      ++c;
    }
    return Z.valueOf(c);
  }
}
