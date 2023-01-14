package irvine.oeis.a113;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a004.A004531;

/**
 * A113406 Half the number of integer solutions to x^2 + 4 * y^2 = n.
 * @author Georg Fischer
 */
public class A113406 extends Sequence1 {

  private long mN = 0;
  private final A004531 mSeq1 = new A004531();

  {
    mSeq1.next();
    mSeq1.next();
  }

  @Override
  public Z next() {
    return (++mN == 1) ? Z.ONE : mSeq1.next().divide2();
  }
}
