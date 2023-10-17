package irvine.oeis.a112;

import irvine.math.z.Z;
import irvine.oeis.a060.A060821;

/**
 * A112227 A scaled Hermite triangle.
 * @author Georg Fischer
 */
public class A112227 extends A060821 {

  @Override
  public Z triangleElement(final int n, final int k) {
    return super.triangleElement(n, k).divide(Z.TWO.pow(k));
  }
}
