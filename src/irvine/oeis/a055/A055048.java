package irvine.oeis.a055;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055048 Numbers of the form 9^i*(3*j+2).
 * @author Sean A. Irvine
 */
public class A055048 implements Sequence {

  private final TreeSet<Long> mA = new TreeSet<>();
  private long mN = 2;

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
