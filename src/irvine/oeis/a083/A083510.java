package irvine.oeis.a083;

import java.util.HashSet;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000124;

/**
 * A036057.
 * @author Sean A. Irvine
 */
public class A083510 extends Sequence1 {

  private final Sequence mA = new A000124();
  private Z mT = mA.next();
  private final HashSet<Z> mS = new HashSet<>();
  private final TreeSet<Z> mQ = new TreeSet<>();

  @Override
  public Z next() {
    while (mQ.isEmpty() || mT.compareTo(mQ.first().multiply2()) < 0) {
      for (final Z u : mS) {
        final Z r = mT.add(u);
        if (r.isEven()) {
          final Z h = r.divide2();
          if (mS.contains(h)) {
            mQ.add(h);
          }
        }
      }
      mS.add(mT);
      mT = mA.next();
    }
    return mQ.pollFirst();
  }
}

