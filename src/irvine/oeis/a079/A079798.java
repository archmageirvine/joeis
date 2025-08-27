package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079798 Partition of positive integers into shortest possible groups, starting with (1), (2,3), (4,5,6), (7,8,9,10,11), such that a(n) = the sum of the terms of the n-th group is a multiple of a(n-1) and a(n) &gt; a(n-1).
 * @author Sean A. Irvine
 */
public class A079798 extends Sequence1 {

  // After R. J. Mathar

  private Z mA = null;
  private Z mFirst = Z.TWO;
  private final boolean mStrict;

  protected A079798(final boolean strict) {
    mStrict = strict;
  }

  /** Construct the sequence. */
  public A079798() {
    this(true);
  }

  protected Z upto(final Z first, final Z asum) {
    final Z trifirst = Functions.TRIANGULAR.z(first.subtract(1));
    Z lst = first;
    while (true) {
      lst = lst.add(1);
      final Z tstsu = Functions.TRIANGULAR.z(lst).subtract(trifirst);
      if (mStrict && tstsu.compareTo(asum) <= 0) {
        continue;
      }
      if (tstsu.mod(asum).isZero()) {
        return lst;
      }
    }
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    final Z last = upto(mFirst, mA);
    mA = Functions.TRIANGULAR.z(last).subtract(Functions.TRIANGULAR.z(mFirst.subtract(1)));
    mFirst = last.add(1);
    return mA;
  }
}

