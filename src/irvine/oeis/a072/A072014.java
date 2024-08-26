package irvine.oeis.a072;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A071115.
 * @author Sean A. Irvine
 */
public class A072014 extends Sequence1 {

  private final DirectSequence mSeq = new A072010();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final TreeSet<Z> mA = new TreeSet<>();
    mA.add(mN);
    Z t = mN;
    while (mA.add(t = mSeq.a(t))) {
      // do nothing
    }
    return mA.first();
  }
}
