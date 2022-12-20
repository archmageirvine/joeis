package irvine.oeis.a352;
// manually dersimple at 2022-12-15 22:48

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a004.A004647;

/**
 * A352721 Perfect cubes whose decimal digits appear in nonincreasing order.
 * @author Georg Fischer
 */
public class A352721 extends Sequence1 {

  private int mN = 0;
  private final A004647 mSeq = new A004647();

  @Override
  public Z next() {
    ++mN;
    return (mN == 1) ? Z.ZERO : mSeq.next().pow(3);
  }
}
