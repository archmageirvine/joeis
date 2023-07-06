package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025209 a(n) = floor(floor(S2)/floor(S1)), where S2 and S1 are, respectively, the 2nd and first elementary symmetric functions of {log(k)}, k = 2,3,...,n.
 * @author Sean A. Irvine
 */
public class A025209 extends A025202 {

  private final Sequence mS1 = new A025201().skip(2);

  @Override
  public Z next() {
    return super.next().divide(mS1.next());
  }
}
