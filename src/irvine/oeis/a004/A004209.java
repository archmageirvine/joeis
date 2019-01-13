package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004209.
 * @author Sean A. Irvine
 */
public class A004209 implements Sequence {

  private int mN = 1;
  private int mBase = 0;

  @Override
  public Z next() {
    if (--mBase < 2) {
      ++mN;
      mBase = mN;
    }
    final String rep = Long.toString(mN, mBase);
    if (rep.contains("a")) {
      throw new UnsupportedOperationException(); // needs non-decimal digit to represent
    }
    return new Z(rep);
  }
}
