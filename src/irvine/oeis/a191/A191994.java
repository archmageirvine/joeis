package irvine.oeis.a191;
// manually partsumm/partsum at 2022-04-12 19:21

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000071;
import irvine.oeis.a003.A003266;

/**
 * A191994 (Sum of first n Fibonacci numbers) times (product of first n Fibonacci numbers).
 * @author Georg Fischer
 */
public class A191994 extends A000071 {

  private Sequence mSeq = new A003266();

  {
    setOffset(1);
    super.next();
    next();
  }

  @Override
  public Z next() {
    return super.next().multiply(mSeq.next());
  }
}
