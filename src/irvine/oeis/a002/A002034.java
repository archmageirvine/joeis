package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A002034 Kempner numbers: smallest positive integer m such that n divides m!.
 * @author Sean A. Irvine
 */
public class A002034 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A002034(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A002034() {
    super(1);
  }

  protected int mN = 0;

  @Override
  public Z a(final Z n) {
    if (n.isProbablePrime()) {
      return n;
    }
    long c = 1;
    Z f = Z.ONE;
    while (true) {
      f = f.mod(n);
      if (f.isZero()) {
        return Z.valueOf(c);
      }
      f = f.multiply(++c);
    }
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }
}

