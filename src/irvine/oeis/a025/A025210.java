package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * A025210 a(n) = floor(floor(S3)/floor(S1)); where S3 and S1 are, respectively, the third and first elementary symmetric functions of {log(k)}, k = 1,2,...,n.
 * @author Sean A. Irvine
 */
public class A025210 extends A025203 {

  private final Sequence mS1 = new SkipSequence(new A025201(), 3);

  @Override
  public Z next() {
    return super.next().divide(mS1.next());
  }
}
