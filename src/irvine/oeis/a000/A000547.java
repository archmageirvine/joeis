package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000547.
 * @author Sean A. Irvine
 */
public class A000547 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    Z v = Z.ONE;
    long c = 0;
    while (true) {
      Z d = v;
      for (int k = 1; k < mN; ++k) {
        v = v.add(1);
        final long t = A000546.collatz(v);
        if (c != t) {
          c = t;
          d = v;
          break;
        }
      }
      if (!d.equals(v) && A000546.collatz(v.add(1)) != c) {
        return Z.valueOf(c);
      }
    }
  }
}
