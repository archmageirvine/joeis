package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a042.A042942;

/**
 * A054349 Successive generations of the variant of the Kolakoski sequence described in A042942.
 * @author Sean A. Irvine
 */
public class A054349 extends A042942 {

  @Override
  public Z next() {
    super.next();
    final StringBuilder sb = new StringBuilder();
    for (long k = 0; k < mLimit; ++k) {
      sb.append(((mSeq.get(k >>> 5) >>> (k & 0x1F)) & 1) == 0 ? '1' : '2');
    }
    return new Z(sb);
  }
}
