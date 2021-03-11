package irvine.oeis.a044;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.AliquotSequence;
import irvine.oeis.Sequence;

/**
 * A044050 a(n) = "length" of the aliquot sequence for n.
 * @author Sean A. Irvine
 */
public class A044050 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final AliquotSequence seq = new AliquotSequence(++mN);
    seq.next();
    final HashSet<Z> seen = new HashSet<>();
    while (seen.add(seq.next())) {
      // do nothing
    }
    seen.remove(null);
    return Z.valueOf(seen.size());
  }
}

