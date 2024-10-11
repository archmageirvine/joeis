package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a013.A013929;

/**
 * A062320 Nonsquarefree numbers squared. A013929(n)^2.
 * @author Sean A. Irvine
 */
public class A062320 extends AbstractSequence {

  private final A013929 mSeq1 = new A013929();

  /** Construct the sequence. */
  public A062320() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().square();
  }
}
