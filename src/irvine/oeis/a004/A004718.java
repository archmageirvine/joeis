package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004718.
 * @author Sean A. Irvine
 */
public class A004718 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = Long.toBinaryString(++mN);
    long v = 0;
    for (int k = 0; k < s.length(); ++k) {
      if (s.charAt(k) == '0') {
        v = -v;
      } else {
        ++v;
      }
    }
    return Z.valueOf(v);
  }
}

