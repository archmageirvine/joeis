package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence1;

/**
 * A082524 a(1)=1, a(2)=2, then use the rule when a(n) is the end of a run, n appears a(n) times.
 * @author Sean A. Irvine
 */
public class A082524 extends PrependSequence {

  /** Construct the sequence. */
  public A082524() {
    super(1, new Sequence1() {
      private int mI = 4;
      private Z mG = Z.THREE;
      private long mF = 2;
      private long mM = -1;

      @Override
      public Z next() {
        if (++mM >= mF) {
          mF = mG.longValueExact();
          mG = Functions.FIBONACCI.z(++mI);
          mM = 0;
        }
        return mG;
      }
    }, 1, 2, 2);
  }
}
