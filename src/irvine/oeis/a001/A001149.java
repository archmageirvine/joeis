package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

import java.util.HashSet;

/**
 * A001149 A self-generating sequence: <code>a(1)=1, a(2)=2, a(n+1)</code> chosen so that <code>a(n+1)-a(n-1)</code> is the first number not obtainable as <code>a(j)-a(i)</code> for <code>1&lt;=i&lt;j&lt;=n</code>.
 * @author Sean A. Irvine
 */
public class A001149 extends MemorySequence {

  private final HashSet<Z> mDiffs = new HashSet<>();
  private Z mA = null;
  private Z mB = null;

  @Override
  protected Z computeNext() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    } else if (mB == null) {
      mB = Z.TWO;
      mDiffs.add(Z.ONE);
      return Z.TWO;
    }
    Z t = Z.ONE;
    while (mDiffs.contains(t)) {
      t = t.add(1);
    }
    t = t.add(mA);
    for (final Z z : this) {
      mDiffs.add(t.subtract(z));
    }
    mA = mB;
    mB = t;
    return t;
  }
}
