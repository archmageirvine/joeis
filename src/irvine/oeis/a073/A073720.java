package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.RecordSequence;
import irvine.oeis.Sequence1;

/**
 * A073720 Let b(1) = 1, b(k+1) = b(k) - k*trunc(k/b(k)+1), where trunc(x) = floor(x) if x&gt;= 0, trunc(x) = ceiling(x) otherwise. Sequence a(n) gives the successive absolute values taken by b(k).
 * @author Sean A. Irvine
 */
public class A073720 extends RecordSequence {

  /** Construct the sequence. */
  public A073720() {
    super(1, new Sequence1() {
      private long mN = 0;
      private Z mB = null;

      @Override
      public Z next() {
        mB = mB == null ? Z.ONE : mB.subtract(mB.add(++mN).divide(mB).multiply(mN));
        return mB.abs();
      }
    });
  }
}
