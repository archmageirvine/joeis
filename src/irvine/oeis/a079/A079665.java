package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079665 Triangular array read by rows: row s contains integers of the form (2^s+1)/(2^r+1) in order of increasing r &lt;= s-1.
 * @author Sean A. Irvine
 */
public class A079665 extends Sequence1 {

  private long mN = 2;
  private long mM = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mM >= mN) {
        ++mN;
        mM = 1;
      }
      final Z[] qr = Z.ONE.shiftLeft(mN).add(1).divideAndRemainder(Z.ONE.shiftLeft(mM).add(1));
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}

