package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * A025210 <code>a(n) = floor(floor(S3)/floor(S1));</code> where <code>S3</code> and <code>S1</code> are, respectively, the third and first elementary symmetric functions of <code>{log(k)}, k = 1,2,...,n</code>.
 * @author Sean A. Irvine
 */
public class A025210 extends A025203 {

  private final Sequence mS1 = new SkipSequence(new A025201(), 3);

  @Override
  public Z next() {
    return super.next().divide(mS1.next());
  }
}
