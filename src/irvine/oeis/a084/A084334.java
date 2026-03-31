package irvine.oeis.a084;

import java.util.HashSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084334 a(1) = 1; a(n+1) is the least squarefree m not already used such that |m-a(n)| is not equal to |a(k+1)-a(k)| for any k &lt; n.
 * @author Sean A. Irvine
 */
public class A084334 extends Sequence1 {

  private Z mA = null;
  private final HashSet<Z> mUsed = new HashSet<>();
  private final HashSet<Z> mForbiddenDiffs = new HashSet<>();

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      Z k = Z.ONE;
      while (true) {
        k = k.add(1);
        if (Predicates.SQUARE_FREE.is(k) && !mUsed.contains(k)) {
          final Z f = mA.subtract(k).abs();
          if (mForbiddenDiffs.add(f)) {
            mA = k;
            break;
          }
        }
      }
    }
    mUsed.add(mA);
    return mA;
  }
}
