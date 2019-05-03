package irvine.oeis.a001;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001069 <code>Log2*(n) (version 2)</code>: take <code>log_2</code> of n this many times to get a number <code>&lt; 2</code>.
 * @author Sean A. Irvine
 */
public class A001069 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long k = ++mN;
    long c = 0;
    while (k > 1) {
      k = LongUtils.lg(k);
      ++c;
    }
    return Z.valueOf(c);
  }
}

