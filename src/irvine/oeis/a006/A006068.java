package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A006068 a(n) is Gray-coded into n.
 * @author Sean A. Irvine
 */
public class A006068 extends AbstractSequence implements DirectSequence {

  private long mN = -1;

  /** Construct the sequence. */
  public A006068() {
    super(0);
  }

  @Override
  public Z next() {
    long t = ++mN;
    long r = 0;
    while (t != 0) {
      r ^= t;
      t >>>= 1;
    }
    return Z.valueOf(r);
  }

  @Override
  public Z a(final int n) {
    long t = n;
    long r = 0;
    while (t != 0) {
      r ^= t;
      t >>>= 1;
    }
    return Z.valueOf(r);
  }

  @Override
  public Z a(final Z n) {
    Z t = n;
    Z r = Z.ZERO;
    while (!t.isZero()) {
      r = r.xor(t);
      t = t.shiftRight(1);
    }
    return r;
  }
}

