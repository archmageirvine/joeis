package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000203;
import java.util.HashMap;

/**
 * A002191 Possible values for sum of divisors of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A002191 extends A000203 {

  private Z mSigma = Z.ZERO;
  // Uses a map so that A002192 can be supported
  protected final HashMap<Z, Z> mSeen = new HashMap<>(1000000);

  @Override
  public Z next() {
    // This is heuristic -- I'm not certain how far ahead a search
    // should be, it does detect when it has failed
    while (true) {
      mSigma = mSigma.add(1);
      // Heuristic process as many terms as mSigma
      for (Z k = Z.ZERO; k.compareTo(mSigma) < 0; k = k.add(1)) {
        final Z t = super.next();
        if (mSeen.containsKey(t)) {
          if (t.compareTo(mSigma) < 0) {
            // Heuristic failed
            throw new RuntimeException();
          }
        } else {
          mSeen.put(t, Z.valueOf(mN));
        }
      }
      if (mSeen.containsKey(mSigma)) {
        return mSigma;
      }
    }
  }
}
