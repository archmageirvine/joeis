package irvine.oeis.a063;
// manually simple3 at 2023-03-23 23:36

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a051.A051801;

/**
 * A063114 n + product of nonzero digits of n.
 * @author Georg Fischer
 */
public class A063114 extends AbstractSequence {

  private int mN = 0;
  private final A051801 mSeq = new A051801();

  /** Construct the sequence. */
  public A063114() {
    super(1);
    mSeq.next();
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).add(mSeq.next());
  }
}
