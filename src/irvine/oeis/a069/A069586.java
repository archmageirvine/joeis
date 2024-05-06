package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a025.A025475;
import irvine.util.array.DynamicArray;

/**
 * A069522.
 * @author Sean A. Irvine
 */
public class A069586 extends Sequence1 {

  private static final int HEURISTIC = 10; // Number of additional prime powers to consider
  private final DynamicArray<Z> mFirsts = new DynamicArray<>();
  private final Sequence mA = new A025475().skip();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    int attempts = 0;
    while (mFirsts.get(mN) == null && ++attempts <= HEURISTIC) {
      final Z q = mA.next();
      final Sequence seq = new A025475().skip();
      Z p;
      while (!(p = seq.next()).equals(q)) {
        final Z d = q.subtract(p);
        if (d.bitLength() < Integer.SIZE) {
          final int dd = d.intValue();
          if (mFirsts.get(dd) == null) {
            if (dd < mN) {
              throw new UnsupportedOperationException("Heuristic failed: " + dd + " has solution " + p);
            }
            mFirsts.set(dd, p);
          }
        }
      }
    }
    final Z res = mFirsts.get(mN);
    return res == null ? Z.ZERO : mFirsts.get(mN);
  }
}
