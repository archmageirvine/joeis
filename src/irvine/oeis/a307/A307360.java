package irvine.oeis.a307;
// manually robots/union2 at 2023-09-18 09:26

import irvine.math.z.Z;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000430;
import irvine.oeis.a089.A089581;

/**
 * A307360 A sequence in which every divisor other than 1 is used at most three times.
 * @author Georg Fischer
 */
public class A307360 extends UnionSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A307360() {
    super(1, new A000430(), new A089581());
  }

  @Override
  public Z next() {
    return (++mN == 1) ? Z.ONE : super.next();
  }
}
