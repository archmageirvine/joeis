package irvine.oeis.a080;

import java.util.HashSet;
import java.util.Set;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A080240 Define two sequences by A_n = mex{A_i,B_i : 0 &lt;= i &lt; n} for n &gt;= 0, B_0=0, B_1=1 and for n &gt;= 2, B_n = 2B_{n-1}+(-1)^{A_n}. Sequence gives A_n.
 * @author Sean A. Irvine
 */
public class A080240 extends Sequence0 {

  private final Set<Integer> mSet = new HashSet<>();
  private int mB = -1;

  protected int select(final int a, final int b) {
    return a;
  }

  @Override
  public Z next() {
    final int a = IntegerUtils.mex(mSet);
    if (mB < 0) {
      mB = 0;
    } else if (mB == 0) {
      mB = 1;
    } else {
      mB = 2 * mB + ((a & 1) == 0 ? 1 : -1);
    }
    mSet.add(mB);
    mSet.add(a);
    return Z.valueOf(select(a, mB));
  }
}

