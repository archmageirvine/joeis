package irvine.oeis.a055;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055044 Numbers of the form 2^(2i+1)*(8*j+1).
 * @author Sean A. Irvine
 */
public class A055044 extends Sequence1 {

  private final TreeSet<Long> mA = new TreeSet<>();
  private long mN = 2;

  @Override
  public Z next() {
    if (mA.isEmpty() || mA.first() >= mN) {
      mA.add(mN);
      mN += 16;
    }
    final long t = mA.pollFirst();
    mA.add(t * 4);
    return Z.valueOf(t);
  }
}
