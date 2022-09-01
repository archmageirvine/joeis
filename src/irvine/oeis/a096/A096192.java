package irvine.oeis.a096;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a005.A005260;

/**
 * A096192 a(n) = Sum_{k=1..n} C(n,k)^4 where C(n,k) is binomial(n,k).
 * @author Georg Fischer
 */
public class A096192 extends A005260 implements SequenceWithOffset {

  /** Construct the sequence. */
  public A096192() {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }

  @Override
  public int getOffset() {
    return 1;
  }
}
