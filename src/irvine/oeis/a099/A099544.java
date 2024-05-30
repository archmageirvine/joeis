package irvine.oeis.a099;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A099544 Odd part of n modulo 3.
 * @author Georg Fischer
 */
public class A099544 extends Sequence1 {

  private int mN;
  private final int mRes;

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
    return Z.valueOf(Functions.MAKE_ODD.l(mN) % mRes);
  }
}
