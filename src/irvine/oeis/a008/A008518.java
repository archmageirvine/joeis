package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a123.A123125;
import irvine.oeis.triangle.DirectArray;

/**
 * A008518 Triangle of Eulerian numbers with rows multiplied by 1 + x.
 * @author Sean A. Irvine
 */
public class A008518 extends A008292 implements DirectArray {

  private final A123125 mA123125 = new A123125();

  /** Construct the sequence. */
  public A008518() {
    super(0);
  }

  private long mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    if (++mM > mN) {
      mM = 1;
      if (++mN == 1) {
        return Z.ONE;
      }
    }
    return get(mN - 1, mM).add(get(mN - 1, mM - 1));
  }

  @Override
  public Z a(final int n, final int k) {
    Z result = mA123125.a(n, k);
    if (k < n) {
      result = result.add(mA123125.a(n, k + 1));
    }
    // System.err.println("A008518(" + n + "," + k + ") = " + result);
    return result;
  }
}
