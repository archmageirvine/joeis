package irvine.oeis.a389;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A389673 a(n) is the length of the sequence obtained by repeated iteration of the "rebase-and-read" operation (A389674), starting at n until one reaches a number already in the sequence.
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

