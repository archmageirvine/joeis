package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003132 Sum of squares of digits of n.
 * @author Sean A. Irvine
 */
public class A003132 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    long sum = 0;
    for (int k = 0; k < s.length(); ++k) {
      final int v = s.charAt(k) - '0';
      sum += v * v;
    }
    return Z.valueOf(sum);
  }
}

