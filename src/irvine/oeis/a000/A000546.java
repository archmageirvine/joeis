package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000546 First occurrence of n consecutive numbers that take same number of steps to reach 1 in 3x+1 problem.
 * @author Sean A. Irvine
 */
public class A000546 implements Sequence {

  static long collatz(Z n) {
    long c = 0;
    while (n.compareTo(Z.ONE) > 0) {
      if (n.isEven()) {
        final Z t = n;
        n = n.makeOdd();
        c += t.auxiliary();
      } else {
        ++c;
        n = n.multiply(3).add(1);
      }
    }
    return c;
  }

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z v = Z.ONE;
    long c = 0;
    while (true) {
      Z d = v;
      for (int k = 1; k < mN; ++k) {
        v = v.add(1);
        final long t = collatz(v);
        if (c != t) {
          c = t;
          d = v;
          break;
        }
      }
      if (!d.equals(v) && collatz(v.add(1)) != c) {
        return d;
      }
    }
  }
}
