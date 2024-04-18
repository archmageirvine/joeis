package irvine.oeis.a049;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A049107 a(n) = Euler phi function applied 5 times to n.
 * @author Sean A. Irvine
 */
public class A049107 extends A049100 {

  @Override
  public Z next() {
    return Functions.PHI.z(super.next());
  }
}

