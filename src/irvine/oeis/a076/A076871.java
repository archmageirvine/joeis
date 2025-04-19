package irvine.oeis.a076;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001694;

/**
 * A061913.
 * @author Sean A. Irvine
 */
public class A076871 extends Sequence1 {

  private final DirectSequence mSeq = DirectSequence.create(new A001694());
  private final TreeSet<Z> mA = new TreeSet<>();
  private int mN = 0;
  private Z mP = mSeq.a(mN);

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mP) > 0) {
      int k = -1;
      do {
        mA.add(mP.add(mSeq.a(++k)));
      } while (!mP.equals(mSeq.a(k)));
      mP = mSeq.a(++mN);
    }
    return mA.pollFirst();
  }
}
