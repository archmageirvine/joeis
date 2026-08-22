package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002182;
import irvine.util.array.DynamicIntArray;

/**
 * A086334 Number of highly composite numbers having n distinct prime factors.
 * @author Sean A. Irvine
 */
public class A086334 extends Sequence0 implements Conjectural {

  private final DynamicIntArray mCounts = new DynamicIntArray();
  private final Sequence mC = new A002182();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    while (mCounts.get(mN + 2) == 0) { // this is heuristic, not sure if it is correct
      mCounts.increment(Functions.OMEGA.i(mC.next()));
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
