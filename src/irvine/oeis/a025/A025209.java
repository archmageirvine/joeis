package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * A025209 <code>a(n) = floor(floor(S2)/floor(S1))</code>, where <code>S2</code> and <code>S1</code> are, respectively, the 2nd and first elementary symmetric functions of <code>{log(k)}, k = 2,3,...,n</code>.
 * @author Sean A. Irvine
 */
public class A025209 extends A025202 {

  private final Sequence mS1 = new SkipSequence(new A025201(), 2);

  @Override
  public Z next() {
    return super.next().divide(mS1.next());
  }
}
