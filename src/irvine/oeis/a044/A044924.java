package irvine.oeis.a044;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A044924 a(n)=so-se, where so(se)=sum of odd(even) base 2 run lengths of n.
 * @author Sean A. Irvine
 */
public class A044924 implements Sequence {

  private long mN = 0;

  protected int base() {
    return 2;
  }

  @Override
  public Z next() {
    final long n = ++mN;
    long prev = -1;
    int len = 0;
    int[] sum = new int[2];
    long m = n;
    while (m != 0) {
      final long r = m % base();
      if (r == prev) {
        ++len;
      } else {
        if (prev != -1) {
          sum[len & 1] += len;
        }
        prev = r;
        len = 1;
      }
      m /= base();
    }
    sum[len & 1] += len;
    return Z.valueOf(sum[1] - sum[0]);
  }
}

