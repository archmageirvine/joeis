package irvine.oeis.a173;
// manually dersimple at 2022-12-15 22:48

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A173537 a(n) = A173522(n)/2.
 * @author Georg Fischer
 */
public class A173537 extends Sequence2 {

  private final A173522 mSeq = new A173522();

  {
    mSeq.next();
    mSeq.next();
  }

  @Override
  public Z next() {
    return mSeq.next().divide2();
  }
}
