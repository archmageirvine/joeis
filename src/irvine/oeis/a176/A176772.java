package irvine.oeis.a176;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A176772.
 * @author Sean A. Irvine
 */
public class A176772 implements Sequence {

  private int mN;

  protected A176772(final int start) {
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

