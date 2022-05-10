package irvine.oeis.a184;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a183.A183568;

/**
 * A184639 Number of partitions of n having no parts with multiplicity 4.
 * a(n) = A183568(n, 0) - A183568(n, 4).
 * @author Georg Fischer
 */
public class A184639 extends A183568 implements Sequence {

  private int mN;
  private int mMult;

  /** Construct the sequence. */
  public A184639() {
    this(4);
  }

  /**
   * Generic constructor with parameters
   * @param mult
   */
  public A184639(final int mult) {
    mN = -1;
    mMult = mult;
  }

  @Override
  public Z next() {
    ++mN;
    return super.get(mN, 0).subtract(super.get(mN, mMult));
  }
}
