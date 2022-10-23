package irvine.oeis.a055;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055047 Numbers of the form 9^i*(3*j+1).
 * @author Sean A. Irvine
 */
public class A055047 extends Sequence1 {

  private final TreeSet<Long> mA = new TreeSet<>();
  private long mN = 1;

  @Override
  public Z next() {
    if (mA.isEmpty() || mA.first() >= mN) {
      mA.add(mN);
      mN += 3;
    }
    final long t = mA.pollFirst();
    mA.add(t * 9);
    return Z.valueOf(t);
  }
}
