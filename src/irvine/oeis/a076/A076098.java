package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A076098 Geometric mean of n-th row in A076099.
 * @author Sean A. Irvine
 */
public class A076098 extends AbstractSequence {

  private A076097 mSeq = new A076097();
  private int mN = 0;

  /** Construct the sequence. */
  public A076098() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq.next().root(++mN);
  }
}
