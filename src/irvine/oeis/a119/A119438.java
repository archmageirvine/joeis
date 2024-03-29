package irvine.oeis.a119;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a018.A018808;

/**
 * A119438 Number of sets of points determined by the intersection of a line with an n X n grid of points.
 * @author Georg Fischer
 */
public class A119438 extends Sequence0 {

  final Sequence mA018808 = new A018808();
  protected long mN;
  /** Construct the sequence. */
  public A119438() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return mA018808.next().add(Z.valueOf(mN).square()).add(Z.ONE);
  }

}
