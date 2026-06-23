package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a058.A058057;

/**
 * A000450 a(n) = A058057(n,n-4).
 * @author Sean A. Irvine
 */
public class A000450 extends AbstractSequence {

  /** Construct the sequence. */
  public A000450() {
    super(4);
  }

  private int mN = 3;

  @Override
  public Z next() {
    ++mN;
    return A058057.t(mN, mN - 4);
  }
}
