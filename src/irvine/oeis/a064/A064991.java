package irvine.oeis.a064;
// manually cordrec at 2022-06-09 19:34

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A064991 In A064990, drop leading 0's from A_k (for k&gt;0) and convert to decimal.
 * <code>a(n+1) = a(n)(4^3^n + 2^3^n - 1) + 2^3^n - 1</code>
 * @author Georg Fischer
 */
public class A064991 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A064991() {
    super(0, 1, 1, 0, 1);
  }

  @Override
  protected Z compute(final int n) {
    final Z eightN1 = Z.TWO.pow(Z.THREE.pow(n)).subtract(1);
    return a(n).multiply(Z.FOUR.pow(Z.THREE.pow(n)).add(eightN1)).add(eightN1);
  }
}
