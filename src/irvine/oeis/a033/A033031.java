package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a003.A003586;

/**
 * A033031 Squarefree kernels of 3-smooth numbers.
 * @author Sean A. Irvine
 */
public class A033031 extends A003586 {

  @Override
  public Z next() {
    final Z t = super.next();
    return (t.isEven() ? Z.TWO : Z.ONE).multiply(t.mod(3) == 0 ? Z.THREE : Z.ONE);
  }
}
