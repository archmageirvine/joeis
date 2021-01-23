package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033265 Number of i such that d(i)&gt;=d(i-1), where Sum{d(i)*2^i: i=0,1,...,m} is base 2 representation of n.
 * @author Sean A. Irvine
 */
public class A033265 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long prev = ++mN & 1;
    long c = 0;
    for (long m = mN >>> 1; m != 0; m >>>= 1) {
      final long t = m & 1;
      if (t >= prev) {
        ++c;
      }
      prev = t;
    }
    return Z.valueOf(c);
  }
}

