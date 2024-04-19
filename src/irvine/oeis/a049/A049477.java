package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049477 For each record-breaking row, m, of A088643, the sequence gives the length, k, of the longest earlier row contained in row m.
 * @author Sean A. Irvine
 */
public class A049477 extends A049476 {

  private final Sequence mA = new A049478();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
