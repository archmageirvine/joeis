package irvine.oeis.a131;
// manually trisum/trisum3 at 2023-06-08 08:30

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000012;
import irvine.oeis.a002.A002260;
import irvine.oeis.a004.A004736;
import irvine.oeis.a023.A023531;
import irvine.oeis.triangle.Product;

/**
 * A131784 Triangle read by rows: (A004736 + A002260 - I) * A000012.
 * @author Georg Fischer
 */
public class A131784 extends Product {

  /** Construct the sequence. */
  public A131784() {
    super(1, new Sequence1() {
      private final A004736 mSeq1 = new A004736();
      private final A002260 mSeq2 = new A002260();
      private final A023531 mSeq3 = new A023531();

      @Override
      public Z next() {
        return mSeq1.next().add(mSeq2.next()).subtract(mSeq3.next());
      }
    }, new A000012());
  }
}
