package irvine.oeis.a143;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a023.A023200;
import irvine.oeis.a046.A046132;

/**
 * A143206 Product of the n-th cousin prime pair.
 * a(n) = A023200(n)*A046132(n).
 * @author Georg Fischer
 */
public class A143206 extends A023200 {

  private final Sequence mSeq2 = new A046132();

  @Override
  public Z next() {
    return super.next().multiply(mSeq2.next());
  }
}
