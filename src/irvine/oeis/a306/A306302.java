package irvine.oeis.a306;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a115.A115004;

/**
 * A306302 Number of regions into which a figure made up of a row of n adjacent congruent rectangles is divided upon drawing diagonals of all possible rectangles (a(0)=0 by convention).
 * @author Georg Fischer
 */
public class A306302 extends Sequence0 {

  private long mN = -1;
  private final A115004 mSeq = new A115004();

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ZERO : mSeq.next().add(mN * (mN + 2));
  }
}
