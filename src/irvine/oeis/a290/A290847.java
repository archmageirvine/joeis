package irvine.oeis.a290;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a006.A006129;

/**
 * A290847 Number of dominating sets in the n-triangular graph.
 * @author Georg Fischer
 */
public class A290847 extends AbstractSequence {

  private A006129 mSeq1 = new A006129();
  private long mN;
  private Z mA;

  /** Construct the sequence. */
  public A290847() {
    super(2);
    mN = 1;
    mSeq1.next();
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    // a(n) = A006129(n) + n * A006129(n-1).
    ++mN;
    final Z b = mSeq1.next();
    final Z result = b.add(mA.multiply(mN));
    mA = b;
    return result;
  }
}
