package irvine.oeis.a331;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a060.A060313;
import irvine.oeis.a060.A060356;

/**
 * A331578 Number of labeled series-reduced rooted trees with n vertices and more than two branches of the root.
 * @author Georg Fischer
 */
public class A331578 extends AbstractSequence {

  private final A060313 mSeq1 = new A060313();
  private final A060356 mSeq2 = new A060356();
  private long mN;

  /** Construct the sequence. */
  public A331578() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    // a(n) = A060313(n) - n*A060356(n-1) for n > 1.
    ++mN;
    final Z result = mSeq1.next().subtract(mSeq2.next().multiply(mN));
    return (mN == 1) ? Z.ZERO : result;
  }
}
