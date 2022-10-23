package irvine.oeis.a055;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055052 Numbers of the form 4^i*(8j+7) or 4^i*(8j+5).
 * @author Sean A. Irvine
 */
public class A055052 extends Sequence1 {

  private final TreeSet<Long> mA = new TreeSet<>();
  private long mN = 5;
  private long mAdd = 2;

  @Override
  public Z next() {
    if (mA.isEmpty() || mA.first() >= mN) {
      mA.add(mN);
      mN += mAdd;
      mAdd = 8 - mAdd;
    }
    final long t = mA.pollFirst();
    mA.add(t * 4);
    return Z.valueOf(t);
  }
}
