package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002262;

/**
 * A032531 a(n) = number of a(i) for 0&lt;=i&lt;n that are equal to A002262(n).
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
