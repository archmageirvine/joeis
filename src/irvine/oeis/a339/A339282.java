package irvine.oeis.a339;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A339282 Triangle read by rows: T(n,k) is the number of unoriented series-parallel networks with n colored elements using exactly k colors.
 * @author Gregory Morse
 */
public class A339282 extends A339228 {
  @Override
  protected Sequence colorings(final int colors) {
    final Sequence ordered = super.colorings(colors).skip(1);
    final Sequence series = new A339158(false, true, colors, super.colorings(colors).skip(1));
    final Sequence parallel = new A339158(false, false, colors, super.colorings(colors).skip(1));
    return new PrependSequence(0, new Sequence1() {
      private boolean mFirst = true;

      @Override
      public Z next() {
        final Z sum = ordered.next().add(series.next()).add(parallel.next());
        if (mFirst) {
          mFirst = false;
          return sum.subtract(colors).divide2();
        }
        return sum.divide2();
      }
    }, Z.ONE);
  }
}
