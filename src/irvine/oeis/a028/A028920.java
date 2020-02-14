package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028920 Pit harvesting sequence for winning solitaire Tchoukaillon (or Mancala).
 * @author Sean A. Irvine
 */
public class A028920 implements Sequence {

  // After David W. Wilson

  private long mN = -1;

  @Override
  public Z next() {
    long n = ++mN;
    long m = 0;
    while (true) {
      if (n % (++m + 1) == 0) {
        return Z.valueOf(m);
      }
      n = n * m / (m + 1);
    }
  }
}
