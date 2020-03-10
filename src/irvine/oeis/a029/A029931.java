package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029931 If <code>2n =</code> Sum <code>2^e_i, a(n) =</code> Sum <code>e_i</code>.
 * @author Sean A. Irvine
 */
public class A029931 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    long sum = 0;
    int k = 1;
    while (m != 0) {
      if ((m & 1) == 1) {
        sum += k;
      }
      ++k;
      m >>>= 1;
    }
    return Z.valueOf(sum);
  }
}
