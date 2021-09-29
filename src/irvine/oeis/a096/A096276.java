package irvine.oeis.a096;
// manually partsum at 2021-09-28

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a001.A001055;

/**
 * A096276 Number of partitions of n with a product &lt;=n.
 * @author Georg Fischer
 */
public class A096276 extends PartialSumSequence {

  protected long mN = -1;

  /** Construct the sequence. */
  public A096276() {
    super(new A001055());
  }

  @Override
  public Z next() {
    ++mN;
    return mN <= 0 ? Z.ZERO : super.next();
  }
}
