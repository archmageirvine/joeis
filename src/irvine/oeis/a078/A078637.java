package irvine.oeis.a078;
// manually knest/jaguar at 2023-03-01 16:41

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a033.A033931;

/**
 * A078637 a(n) = rad(n(n+1)(n+2)), where rad(m) is the largest squarefree number dividing m (see A007947).
 * @author Georg Fischer
 */
public class A078637 extends A033931 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).squareFreeKernel();
  }
}
