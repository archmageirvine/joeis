package irvine.oeis.a055;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055046 Numbers of the form 4^i*(8*j+3).
 * @author Sean A. Irvine
 */
public class A055046 implements Sequence {

  private final TreeSet<Long> mA = new TreeSet<>();
  private long mN = 3;

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
