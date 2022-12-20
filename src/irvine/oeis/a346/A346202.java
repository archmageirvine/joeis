package irvine.oeis.a346;
// manually dersimple at 2022-12-15 22:48

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002819;

/**
 * A346202 a(n) = L(n)^2, where L is Liouville's function.
 * @author Georg Fischer
 */
public class A346202 extends Sequence1 {

  private final A002819 mSeq = new A002819();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return mSeq.next().square();
  }
}
