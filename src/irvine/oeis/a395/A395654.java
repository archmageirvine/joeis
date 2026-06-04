package irvine.oeis.a395;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a022.A022004;
import irvine.oeis.a022.A022005;

/**
 * A395654 allocated for Robert Israel.
 * @author Sean A. Irvine
 */
public class A395654 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.create(new A022004());
  private final TreeSet<Z> mB = new TreeSet<>();
  private final Sequence mC = new A022005();
  private Z mN = Z.ZERO;
  {
    mB.add(mC.next());
  }

  private boolean is(final Z n) {
    for (long k = 0; mA.a(k).compareTo(n) < 0; ++k) {
      final Z d = n.subtract(mA.a(k));
      while (d.compareTo(mB.last()) > 0) {
        mB.add(mC.next());
      }
      if (mB.contains(n.subtract(mA.a(k)))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(6);
      if (is(mN)) {
        return mN;
      }
    }
  }
}

