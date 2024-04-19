package irvine.oeis.a342;
// manually robot/nopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a030.A030101;

/**
 * A342121 a(n) is the remainder when the larger of n and its binary reverse is divided by the smaller.
 * a(n) = max(n, A030101(n)) mod min(n, A030101(n)).
 * @author Georg Fischer
 */
public class A342121 extends AbstractSequence {

  private int mN;
  private final A030101 mSeq1 = new A030101();

  /** Construct the sequence. */
  public A342121() {
    super(1);
    mN = 0;
    mSeq1.next();
  }

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    final Z t1 = mSeq1.next();
    return n.max(t1).mod(n.min(t1));
  }
}
