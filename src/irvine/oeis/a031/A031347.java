package irvine.oeis.a031;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031347 Multiplicative digital root of <code>n</code> (keep multiplying digits of n until reaching a single digit).
 * @author Sean A. Irvine
 */
public class A031347 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    while (m > 9) {
      m = LongUtils.digitProduct(m);
    }
    return Z.valueOf(m);
  }
}

