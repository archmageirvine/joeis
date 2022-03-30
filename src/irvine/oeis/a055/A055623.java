package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.array.DynamicLongArray;

/**
 * A055623 First occurrence of run of primes congruent to 1 mod 4 of exactly length n.
 * @author Sean A. Irvine
 */
public class A055623 extends A000040 {

  private final DynamicLongArray mA = new DynamicLongArray();
  private int mN = 0;
  private final long mMod;
  private final long mResidue;

  protected A055623(final long mod, final long residue) {
    mMod = mod;
    mResidue = residue;
  }

  /** Construct the sequence. */
  public A055623() {
    this(4, 1);
  }

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == 0) {
      final Z p = super.next();
      if (p.mod(mMod) == mResidue) {
        int cnt = 1;
        while (super.next().mod(mMod) == mResidue) {
          ++cnt;
        }
        if (mA.get(cnt) == 0) {
          mA.set(cnt, p.longValueExact());
        }
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}
