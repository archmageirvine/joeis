package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a209.A209675;

/**
 * A053381 Maximal number of linearly independent smooth nowhere-zero vector fields on a (2n+1)-sphere.
 * @author Sean A. Irvine
 */
public class A053381 extends AbstractSequence {

  private final A209675 mSeq1 = new A209675();

  /** Construct the sequence. */
  public A053381() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(1);
  }
}
