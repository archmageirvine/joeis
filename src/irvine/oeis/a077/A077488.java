package irvine.oeis.a077;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000042;

/**
 * A077486.
 * @author Sean A. Irvine
 */
public class A077488 extends Sequence1 {

  private final Sequence mS = new A000042();
  private Z mN = mS.next();
  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    while (mA.isEmpty() || mN.compareTo(mA.first()) <= 0) {
      final Sequence b = new A000042();
      Z c;
      while (!(c = b.next()).equals(mN)) {
        mA.add(c.multiply(mN));
      }
      mN = mS.next();
    }
    return mA.pollFirst();
  }
}

