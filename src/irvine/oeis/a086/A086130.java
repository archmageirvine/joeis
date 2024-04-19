package irvine.oeis.a086;
// manually robot/nopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a003.A003415;

/**
 * A086130 a(n) = lcm(n, A003415(n)).
 * @author Georg Fischer
 */
public class A086130 extends AbstractSequence {

  private int mN;
  private final A003415 mSeq1 = new A003415();

  /** Construct the sequence. */
  public A086130() {
    super(1);
    mN = 0;
    mSeq1.next();
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).lcm(mSeq1.next());
  }
}
