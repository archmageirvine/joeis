package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025200 a(n) = floor(floor(S3)/floor(S1)), where S3 and S1 are, respectively, the 3rd and first elementary symmetric functions of {sqrt(k), k = 1,2,...,n}.
 * @author Sean A. Irvine
 */
public class A025200 extends A025194 {

  /** Construct the sequence. */
  public A025200() {
    super(2);
  }

  private final Sequence mS1 = new A025224().skip(3);

  @Override
  public Z next() {
    return super.next().divide(mS1.next());
  }
}
