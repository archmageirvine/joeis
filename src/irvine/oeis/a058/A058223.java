package irvine.oeis.a058;

import java.util.Arrays;
import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicByteArray;

/**
 * A058223 Tree of Meeussen sequences read across rows.
 * @author Sean A. Irvine
 */
public class A058223 extends Sequence0 {

  private final LinkedList<long[]> mA = new LinkedList<>();
  {
    mA.add(new long[] {1});
  }

  @Override
  public Z next() {
    final long[] res = mA.pollFirst();
    final LongDynamicByteArray cnts = new LongDynamicByteArray();
    for (long k = 0; k < 1L << res.length; ++k) {
      long j = k;
      long s = 0;
      for (int i = 0; j != 0; ++i, j >>>= 1) {
        if ((j & 1) == 1) {
          s += res[i];
        }
        final byte c = cnts.get(s);
        if (c < 2) {
          cnts.set(s, (byte) (c + 1));
        }
      }
    }
    for (long j = res[res.length - 1]; j < cnts.length(); ++j) {
      if (cnts.get(j) == 1) {
        final long[] t = Arrays.copyOf(res, res.length + 1);
        t[res.length] = j + 1;
        mA.add(t);
      }
    }
    return Z.valueOf(res[res.length - 1]);
  }
}

