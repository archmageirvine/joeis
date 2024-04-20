package irvine.oeis.a024;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A024709 Least prime divisor of A024702(n).
 * @author Sean A. Irvine
 */
public class A024709 extends A024702 {

  {
    setOffset(4);
    super.next();
  }

  @Override
  public Z next() {
    return Functions.LPF.z(super.next());
  }
}
