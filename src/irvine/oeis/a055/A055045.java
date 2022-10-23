package irvine.oeis.a055;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055045 Numbers of the form 4^i*(8*j+5).
 * @author Sean A. Irvine
 */
public class A055045 extends Sequence1 {

  private final TreeSet<Long> mA = new TreeSet<>();
  private long mN = 5;

  @Override
  public Z next() {
    if (mA.isEmpty() || mA.first() >= mN) {
      mA.add(mN);
      mN += 8;
    }
    final long t = mA.pollFirst();
    mA.add(t * 4);
    return Z.valueOf(t);
  }
}
