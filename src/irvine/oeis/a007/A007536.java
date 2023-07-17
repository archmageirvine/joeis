package irvine.oeis.a007;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000384;

/**
 * A007536 Numbers that are not the sum of 3 hexagonal numbers (probably finite).
 * @author Sean A. Irvine
 */
public class A007536 extends A000384 {

  /** Construct the sequence. */
  public A007536() {
    super(1);
  }

  // This sequence is likely finite and this generates all the terms

  private long mN = 3;
  private long mR = 0;
  private final TreeSet<Long> mForbidden = new TreeSet<>();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      while (mN >= mR) {
        mR = super.next().longValueExact();
        final A000384 a = new A000384();
        long s;
        while ((s = a.next().longValueExact()) <= mR) {
          final A000384 b = new A000384();
          long t;
          while ((t = b.next().longValueExact()) <= s) {
            mForbidden.add(mR + s + t);
          }
        }
      }
      if (!mForbidden.remove(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
