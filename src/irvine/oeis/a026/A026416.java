package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026416 A 2-way classification of integers: <code>a(1) = 1, a(2) = 2</code> and for <code>n &gt; 2, a(n)</code> is the smallest number not of the form <code>a(i)*a(j)</code> for <code>1 &lt;= i &lt; j &lt; n</code>.
 * @author Sean A. Irvine
 */
public class A026416 extends MemorySequence {

  protected final TreeSet<Z> mForbidden = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  protected Z computeNext() {
    do {
      mN = mN.add(1);
    } while (mForbidden.remove(mN));
    for (final Z t : this) {
      mForbidden.add(t.multiply(mN));
    }
    return mN;
  }
}
