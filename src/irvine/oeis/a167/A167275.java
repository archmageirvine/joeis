package irvine.oeis.a167;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001316;

/**
 * A167275 Row sums of triangle A167274 (a variant of Gould&apos;s sequence A001316).
 * @author Georg Fischer
 */
public class A167275 extends AbstractSequence {

  private int mN = -1;
  private final A001316 mSeq = new A001316();

  /** Construct the sequence. */
  public A167275() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = Z.TWO.multiply(mSeq.next());
    return (mN == 0) ? Z.ONE : result;
  }
}
