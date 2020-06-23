package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001203;

/**
 * A032523 Index of first occurrence of n as a term in <code>A001203</code>, the continued fraction for <code>Pi</code>.
 * @author Sean A. Irvine
 */
public class A032523 implements Sequence {

  private final MemorySequence mA001203 = MemorySequence.cachedSequence(new A001203());
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    int k = 0;
    while (!mN.equals(mA001203.a(k))) {
      ++k;
    }
    return Z.valueOf(k + 1);
  }
}
