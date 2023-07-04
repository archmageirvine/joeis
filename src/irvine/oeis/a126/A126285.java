package irvine.oeis.a126;
// manually euleras at 2021-11-24 08:46

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000081;
import irvine.oeis.a002.A002861;
import irvine.oeis.transform.EulerTransform;

/**
 * A126285 Number of partial mappings (or mapping patterns) from n points to themselves; number of partial endofunctions.
 * Euler transform of A002861 + A000081 = [1, 2, 4, 9, 20, 51, 125, 329, 862, 2311, ... ] + [ 1, 1, 2, 4, 9, 20, 48, 115, 286, 719, ...] = A124682.
 * @author Georg Fischer
 */
public class A126285 extends EulerTransform {

  private static final class MySequence extends Sequence0 {
    private final Sequence mA000081 = new A000081();
    private final Sequence mA002861 = new A002861();

    private MySequence() {
      mA000081.next();
    }

    @Override
    public Z next() {
      return mA000081.next().add(mA002861.next());
    }
  }

  /** Construct the sequence. */
  public A126285() {
    super(new MySequence(), 1);
  }
}
