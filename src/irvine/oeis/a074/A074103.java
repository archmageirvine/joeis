package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A074103 a(n) = n!/A074859(n).
 * @author Sean A. Irvine
 */
public class A074103 extends A074859 {

  @Override
  public Z next() {
    final Z t = super.next();
    return Functions.FACTORIAL.z(mN).divide(t);
  }
}
