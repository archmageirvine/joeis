package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a001.A001838;

/**
 * A056853 Numbers k satisfying phi(k+1) - phi(k-1) = 2.
 * @author Sean A. Irvine
 */
public class A056853 extends A001838 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
