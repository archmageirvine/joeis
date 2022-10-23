package irvine.oeis.a055;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055049 Numbers of the form 5^(2*i+1)*(5*j+-2).
 * @author Sean A. Irvine
 */
public class A055049 extends Sequence1 {

  private final TreeSet<Long> mA = new TreeSet<>();
  private long mN = 10;
  private long mAdd = 5;

  @Override
  public Z next() {
    if (mA.isEmpty() || mA.first() >= mN) {
      mA.add(mN);
      mN += mAdd;
      mAdd = 25 - mAdd;
    }
    final long t = mA.pollFirst();
    mA.add(t * 25);
    return Z.valueOf(t);
  }
}
