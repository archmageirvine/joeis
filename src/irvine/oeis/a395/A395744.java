package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000793;

/**
 * A395744 Number of occurrences of the n-th smallest value in A000793.
 * @author Sean A. Irvine
 */
public class A395744 extends Sequence1 {

  private final Sequence mS = new A000793();
  private Z mA = null;

  @Override
  public Z next() {
    final Z t = mA == null ? mS.next() : mA;
    long len = 1;
    while ((mA = mS.next()).equals(t)) {
      ++len;
    }
    return Z.valueOf(len);
  }
}
