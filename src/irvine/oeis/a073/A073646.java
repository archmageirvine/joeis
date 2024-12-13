package irvine.oeis.a073;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073565.
 * @author Sean A. Irvine
 */
public class A073646 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final List<String> s = new ArrayList<>();
    final FactorSequence fs = Jaguar.factor(mN);
    for (final Z p : fs.toZArray()) {
      final String ps = p.toString();
      for (int k = 0; k < fs.getExponent(p); ++k) {
        s.add(ps);
      }
    }
    Collections.sort(s);
    final StringBuilder sb = new StringBuilder();
    for (final String t : s) {
      sb.append(t);
    }
    return new Z(sb);
  }
}
