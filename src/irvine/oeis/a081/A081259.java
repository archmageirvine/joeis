package irvine.oeis.a081;
// manually n2/n3add1 at 2023-05-02 19:56

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a151.A151799;

/**
 * A081259 a(n) is the smallest k such that C(3n,n) divides k!.
 * @author Georg Fischer
 */
public class A081259 extends AbstractSequence {

  private final A151799 mSeq1 = new A151799();

  /** Construct the sequence. */
  public A081259() {
    super(1);
  }

  @Override
  public Z next() {
    final Z result = mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    return result;
  }
}
