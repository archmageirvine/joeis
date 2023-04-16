package irvine.oeis.a242;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A242849 Triangle read by rows: T(n,k) = A060828(n)/(A060828(k) * A060828(n-k)).
 * @author Georg Fischer
 */
public class A242849 extends BaseTriangle {

  /** Construct the sequence. */
  public A242849() {
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    final int val = ZUtils.valuation(Binomial.binomial(n, k), Z.THREE);
    return (val == 0) ? Z.ONE : Z.THREE.pow(val);
  }
}
