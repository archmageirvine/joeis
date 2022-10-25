package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026416 A 2-way classification of integers: a(1) = 1, a(2) = 2 and for n &gt; 2, a(n) is the smallest number not of the form a(i)*a(j) for 1 &lt;= i &lt; j &lt; n.
 * @author Sean A. Irvine
 */
public class A026416 extends MemorySequence {

  {
    setOffset(1);
  }

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
