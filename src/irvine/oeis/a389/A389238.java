package irvine.oeis.a389;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a237.A237270;

/**
 * A389238 Odd numbers k whose symmetric representation of sigma, SRS(k), consists of an odd number, &gt;1, of parts and whose center part is the minimum of all parts.
 * @author Sean A. Irvine
 */
public class A389238 extends Sequence1 {

  private int mN = 7;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final ArrayList<Z> parts = A237270.symmetricRepresentationSigma(mN);
      if (parts.size() > 1 && (parts.size() & 1) == 1) {
        final Z min = Functions.MIN.z(parts);
        if (min.equals(parts.get(parts.size() / 2))) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
