package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A030456 a(0) = 2; a(n) is smallest prime containing a(n-1) as substring.
 * @author Sean A. Irvine
 */
public class A030456 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      final String s = mA.toString();
      Z smallest = null;
      long lim = 10;
      long m = 0; // value in which to embed s
      while (true) { // loop over ever increasing lengths
        while (++m < lim) {
          final String t = String.valueOf(m);
          for (int j = 0; j <= t.length(); ++j) {
            // embed s at position j of t
            final Z candidate = new Z(t.substring(0, j) + s + t.substring(j));
            if (candidate.isProbablePrime() && (smallest == null || candidate.compareTo(smallest) < 0)) {
              // Found new smallest solution
              smallest = candidate;
            }
          }
        }
        if (smallest != null) {
          // We found a solution at this length
          mA = smallest;
          break;
        }
        // Move to next length
        lim *= 10;
        --m;
      }
    }
    return mA;
  }
}
