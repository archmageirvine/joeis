package irvine.oeis.a081;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A081692 Define two sequences by A_n = mex{A_i,B_i : 0 &lt;= i &lt; n}, B_n = B_{n-1} + (A_n-A_{n-1})(A_n-A_{n-1}+1), where the mex of a set is the smallest nonnegative integer not in the set. Sequence gives A_n. B_n is in A081693.
 * @author Sean A. Irvine
 */
public class A081692 extends Sequence0 {

  protected final TreeSet<Z> mB = new TreeSet<>();
  private final LongDynamicBooleanArray mA = new LongDynamicBooleanArray();
  private long mM = 0;

  private void updateB() {
    if (mB.isEmpty()) {
      mB.add(Z.ZERO);
    } else {
      long am1 = mM - 1;
      while (!mA.isSet(am1)) {
        --am1;
      }
      mB.add(mB.last().add(Z.valueOf(mM - am1).multiply(mM - am1 + 1)));
    }
  }

  @Override
  public Z next() {
    while (mA.isSet(mM) || mB.contains(Z.valueOf(mM))) {
      ++mM;
    }
    mA.set(mM);
    updateB();
    return Z.valueOf(mM);
  }
}
