package irvine.oeis.a093;
// manually floor at 2021-09-01 16:25

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A093392 [n/25] + [(n+1)/25] + [(n+2)/25] + [(n+3)/25] + [(n+4)/25].
 * @author Georg Fischer
 */
public class A093392 implements Sequence {

  protected long mN;
  
  /** Construct the sequence. */
  public A093392() {
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    final long den = 25;
    for (int k = 0; k < 5; ++k) {
      sum += (mN + k) / den;
    }
    return Z.valueOf(sum);
  }

}
