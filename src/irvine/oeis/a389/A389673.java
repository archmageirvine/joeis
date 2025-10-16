package irvine.oeis.a389;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A388063.
 * @author Sean A. Irvine
 */
public class A389673 extends Sequence1 {

  private final DirectSequence mA = new A389674();
  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    final HashSet<Z> seen = new HashSet<>();
    while (seen.add(t)) {
      t = mA.a(t);
    }
    return Z.valueOf(seen.size());
  }
}

