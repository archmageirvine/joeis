package irvine.oeis.a099;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A099544 Odd part of n modulo 3.
 * (n>>valuation(n, 2)) % 3.
 * @author Georg Fischer
 */
public class A099544 implements Sequence {

  private int mN;
  private int mRes;

  /** Construct the sequence. */
  public A099544() {
    this(3);
  }

  /**
   * Generic constructor with parameters
   * @param res residue
   */
  public A099544(final int res) {
    mN = 0;
    mRes = res;
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf((mN >> ZUtils.valuation(Z.valueOf(mN), Z.TWO)) % mRes);
  }
}
