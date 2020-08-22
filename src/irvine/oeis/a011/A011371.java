package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011371 a(n) = n minus (number of 1's in binary expansion of n). Also highest power of 2 dividing n!.
 * @author Sean A. Irvine
 */
public class A011371 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN - (long) Long.bitCount(mN));
  }
}

