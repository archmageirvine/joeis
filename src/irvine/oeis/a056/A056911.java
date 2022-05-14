package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a039.A039956;

/**
 * A056911 Odd squarefree numbers.
 * @author Sean A. Irvine
 */
public class A056911 extends A039956 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
