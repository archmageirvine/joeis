package irvine.oeis.a072;
// manually partsum at 2021-09-27 19:03

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a004.A004125;

/**
 * A072481 a(n) = Sum_{k=1..n} Sum_{d=1..k} (k mod d).
 * @author Georg Fischer
 */
public class A072481 extends PartialSumSequence {

  protected long mN = -1;

  /** Construct the sequence. */
  public A072481() {
    super(new A004125());
  }

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? Z.ZERO : super.next();
  }
}
