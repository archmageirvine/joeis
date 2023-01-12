package irvine.oeis.a297;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a053.A053871;

/**
 * A297474 Number of maximal matchings in the n-cocktail party graph.
 * @author Georg Fischer
 */
public class A297474 extends AbstractSequence {

  private A053871 mSeq1 = new A053871();
  private long mN;
  private Z mA;

  /** Construct the sequence. */
  public A297474() {
    super(1);
    mN = 0;
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    ++mN;
    final Z b = mSeq1.next();
    final Z result = b.add(mA.multiply(mN));
    mA = b;
    return result;
  }
}
