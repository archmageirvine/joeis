package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * A025200 <code>s(n) = [ S3/S1 ]</code>, where <code>S3</code> and <code>S1</code> are, respectively, the 3rd and first elementary symmetric functions of <code>{sqrt(k), k = 1,2,...,n} ]</code>.
 * @author Sean A. Irvine
 */
public class A025200 extends A025194 {

  private final Sequence mS1 = new SkipSequence(new A025224(), 3);

  @Override
  public Z next() {
    return super.next().divide(mS1.next());
  }
}
