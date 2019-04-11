package irvine.oeis.a119;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A119435 <code>a(n) =</code> (binary reversal of n)th integer among those positive integers not occurring earlier in the sequence.
 * @author Sean A. Irvine
 */
public class A119435 implements Sequence {

  private long mN = 0;
  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();

  private long reverse(final long v) {
    final String binaryForward = Long.toBinaryString(v);
    final String binaryReverse = new StringBuilder(binaryForward).reverse().toString();
    return Long.parseLong(binaryReverse, 2);
  }

  @Override
  public Z next() {
    long c = reverse(++mN);
    long pos = 0;
    while (c > 0) {
      final long n = ++pos;
      if (!mUsed.isSet(n)) {
        --c;
      }
    }
    mUsed.set(pos);
    return Z.valueOf(pos);
  }
}

