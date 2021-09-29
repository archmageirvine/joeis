package irvine.oeis.a103;
// manually partsum at 2021-09-28

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a026.A026898;

/**
 * A103439 a(n) = Sum_{i=0..n-1} Sum_{j=0..i} (i-j+1)^j.
 * @author Georg Fischer
 */
public class A103439 extends PartialSumSequence {

  protected long mN = -1;

  /** Construct the sequence. */
  public A103439() {
    super(new A026898());
  }

  @Override
  public Z next() {
    ++mN;
    return mN <= 0 ? Z.ZERO : super.next();
  }
}
