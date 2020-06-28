package irvine.oeis.a032;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032849 Numbers n such that base 2 representation <code>Sum{d(i)*2^i: i=0,1,...,m)</code> has <code>d(m)&lt;=d(m-1)&gt;=d(m-2)&lt;=..</code>.
 * @author Sean A. Irvine
 */
public class A032849 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mLimit = Z.valueOf(base());
  private boolean mUp = true;

  {
    for (long k = 1; k < base(); ++k) {
      mA.add(Z.valueOf(k));
    }
  }

  protected long base() {
    return 2;
  }

  @Override
  public Z next() {
    final Z res = mA.pollFirst();
    final long last = res.mod(base());
    if (res.compareTo(mLimit) >= 0) {
      mUp = !mUp;
      mLimit = mLimit.multiply(base());
    }
    final Z t = res.multiply(base());
    if (mUp) {
      for (long k = last; k < base(); ++k) {
        mA.add(t.add(k));
      }
    } else {
      for (long k = 0; k <= last; ++k) {
        mA.add(t.add(k));
      }
    }
    return res;
  }
}
