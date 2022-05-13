package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a001.A001838;

/**
 * A056853 Numbers n satisfying phi(n+1) - phi(n-1) = 2.
 * @author Sean A. Irvine
 */
public class A056853 extends A001838 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
