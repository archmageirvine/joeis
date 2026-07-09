package irvine.oeis.a085;

import java.util.TreeSet;

import irvine.math.z.InverseSigma;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085768.
 * @author Sean A. Irvine
 */
public class A085790 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      mA.addAll(InverseSigma.inverseSigma(Z.valueOf(++mN), 1));
    }
    return mA.pollFirst();
  }
}
