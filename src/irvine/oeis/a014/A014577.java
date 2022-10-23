package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014577 The regular paper-folding sequence (or dragon curve sequence).
 * @author Sean A. Irvine
 */
public class A014577 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    while ((m & 1) == 0) {
      m >>>= 1;
    }
    m >>>= 1;
    return (m & 1) == 0 ? Z.ONE : Z.ZERO;
  }
}
