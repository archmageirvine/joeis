package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002262;

/**
 * A032531 An inventory sequence: triangle read by rows, where T(n, k), 0 &lt;= k &lt;= n, records the number of k's thus far in the flattened sequence.
 * @author Sean A. Irvine
 */
public class A032531 extends MemorySequence {

  private final Sequence mA002262 = new A002262();

  @Override
  protected Z computeNext() {
    final Z target = mA002262.next();
    long c = 0;
    for (final Z t : this) {
      if (target.equals(t)) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
