package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000984;
import irvine.oeis.a005.A005249;

/**
 * A067689 Inverse of determinant of n X n matrix whose (i,j)-th element is 1/(i+j).
 * Equals A005249 * A000984.
 * @author Georg Fischer
 */
public class A067689 extends A005249 {

  private final Sequence mSeq = new A000984();

  @Override
  public Z next() {
    return super.next().multiply(mSeq.next());
  }
}
