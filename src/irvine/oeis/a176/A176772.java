package irvine.oeis.a176;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A176772 Smallest power of 13 whose decimal expansion contains n.
 * @author Sean A. Irvine
 */
public class A176772 extends AbstractSequence {

  private int mN;

  protected A176772(final int start) {
    super(1);
    mN = start;
  }

  /** Default constructor. */
  public A176772() {
    this(0);
  }

  protected Z base() {
    return Z.valueOf(13);
  }

  @Override
  public Z next() {
    final String v = String.valueOf(++mN);
    Z b = Z.ONE;
    while (true) {
      if (b.toString().contains(v)) {
        return b;
      }
      b = b.multiply(base());
    }
  }
}

