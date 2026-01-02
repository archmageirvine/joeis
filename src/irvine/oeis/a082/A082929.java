package irvine.oeis.a082;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a080.A080435;

/**
 * A082929 Primes not of form A080435(i)+A080435(j).
 * @author Sean A. Irvine
 */
public class A082929 extends A000040 {

  private final DirectSequence mA = DirectSequence.create(new A080435());
  private final TreeSet<Z> mSeen = new TreeSet<>();
  private int mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      while (mA.a(mN).compareTo(p) < 0) {
        for (int k = 1; k <= mN; ++k) {
          final Z t = mA.a(mN).add(mA.a(k));
          if (t.isProbablePrime()) {
            mSeen.add(t);
          }
        }
        ++mN;
      }
      if (!mSeen.remove(p)) {
        return p;
      }
    }
  }
}
