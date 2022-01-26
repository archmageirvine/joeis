package irvine.oeis.a054;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054237.
 * @author Sean A. Irvine
 */
public class A054237 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  private long encode(final long a, final long b) {
    return (a + b) * (a + b + 1) / 2 + b;
  }

  private long[] decode(final long n) {
    final long s = (LongUtils.sqrt(8 * n + 1) - 1) / 2;
    //final long s = CR.valueOf(8 * n + 1).sqrt().subtract(CR.ONE).divide(CR.TWO).floor().longValueExact();
    final long u = encode(s, 0);
    final long r = n - u;
    return new long[] {s - r, r};
  }

  private long[] add(final long[] a, final long[] b) {
    return new long[] {a[0] + b[0], a[1] + b[1]};
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    final long[] a = decode(mN - mM);
    final long[] b = decode(mM);
    final long[] c = add(a, b);
    return Z.valueOf(encode(c[0], c[1]));
  }
}

