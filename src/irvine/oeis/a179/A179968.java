package irvine.oeis.a179;

import irvine.math.z.Z;
import irvine.oeis.a051.A051168;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A179968 &apos;AT(n,k)&apos; triangle read by rows. AT(n,k) is the number of aperiodic k-compositions of n.
 * @author Georg Fischer
 */
public class A179968 extends BaseTriangle {

  private A051168 mA051168 = new A051168();

  /** Construct the sequence. */
  public A179968() {
    super(1, 1, 1);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return mA051168.t(n, k).multiply(k);
  }
}
