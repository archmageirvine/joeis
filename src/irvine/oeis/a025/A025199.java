package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025199 a(n) = floor(floor(S2)/floor(S1)), where S2 and S1 are, respectively, the 2nd and first elementary symmetric functions of {sqrt(k), k = 1,2,...,n}.
 * @author Sean A. Irvine
 */
public class A025199 extends A025193 {

  private final Sequence mS1 = new A025224().skip(2);

  @Override
  public Z next() {
    return super.next().divide(mS1.next());
  }
}
