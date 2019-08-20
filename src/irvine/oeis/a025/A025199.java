package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * A025199 <code>a(n) = floor(floor(S2)/floor(S1))</code>, where <code>S2</code> and <code>S1</code> are, respectively, the 2nd and first elementary symmetric functions of <code>{sqrt(k), k = 1,2,...,n}</code>.
 * @author Sean A. Irvine
 */
public class A025199 extends A025193 {

  private final Sequence mS1 = new SkipSequence(new A025224(), 2);

  @Override
  public Z next() {
    return super.next().divide(mS1.next());
  }
}
