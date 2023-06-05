package irvine.oeis.a070;
// manually m1pow at 2023-06-04 11:17

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a032.A032615;

/**
 * A070747 a(n) = signum(sin(n)), where signum=A057427.
 * @author Georg Fischer
 */
public class A070747 extends AbstractSequence {

  private int mN = -1;
  private final A032615 mSeq = new A032615();

  /** Construct the sequence. */
  public A070747() {
    super(0);
    mSeq.next();
  }

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ZERO : mSeq.next().testBit(0) ? Z.NEG_ONE : Z.ONE;
  }
}
