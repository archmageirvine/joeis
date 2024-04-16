package irvine.oeis.a006;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002997;
import irvine.util.array.DynamicArray;

/**
 * A006931 Least Carmichael number with n prime factors, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A006931 extends AbstractSequence {

  private final A002997 mSeq1 = new A002997();

  /** Construct the sequence. */
  public A006931() {
    super(3);
  }

  private final DynamicArray<Z> mLeast = new DynamicArray<>();
  private int mN = 2;

  @Override
  public Z next() {
    ++mN;
    while (mLeast.get(mN) == null) {
      final Z n = mSeq1.next();
      final int o = Functions.OMEGA.i(n);
      if (mLeast.get(o) == null) {
        mLeast.set(o, n);
      }
    }
    return mLeast.get(mN);
  }
}
