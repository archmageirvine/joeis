package irvine.oeis.a347;
// manually anopsn 0,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a120.A120963;

/**
 * A347428 Expansion of g.f. Product_{k&gt;=2} 1/(1-x^phi(k)).
 * @author Georg Fischer
 */
public class A347428 extends AbstractSequence {

  private int mN = -1;
  private A120963 mSeq1 = new A120963();
  private Z mA;

  /** Construct the sequence. */
  public A347428() {
    super(0);
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Z b = mSeq1.next();
    final Z result = b.subtract(mA);
    mA = b;
    return result;
  }
}
