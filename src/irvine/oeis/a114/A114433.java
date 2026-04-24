package irvine.oeis.a114;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A114433 Last digit (the checksum) of 10-digit ISBN numbers, 10 is represented as "X".
 * @author Sean A. Irvine
 */
public class A114433 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final String t = "00000000" + ++mN;
    final String s = t.substring(t.length() - 9);
    long sum = 0;
    for (int k = 0; k < s.length(); ++k) {
      sum += (k + 1L) * (s.charAt(k) - '0');
    }
    return Z.valueOf(sum % 11);
  }
}

