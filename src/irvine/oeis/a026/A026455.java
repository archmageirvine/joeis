package irvine.oeis.a026;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A026455 a(n) = least positive integer &lt; a(n-1) and not a(i)*a(j)-2 for 1&lt;=i&lt;j&lt;=n.
 * @author Sean A. Irvine
 */
public class A026455 extends MemorySequence {

  private final TreeSet<Z> mForbidden = new TreeSet<>();
  private Z mN = Z.ONE;

  @Override
  protected Z computeNext() {
    do {
      mN = mN.add(1);
    } while (mForbidden.remove(mN));
    for (final Z t : this) {
      mForbidden.add(t.multiply(mN).subtract(2));
    }
    return mN;
  }
}
