package irvine.oeis.a131;
// manually trisum/trisum3 at 2023-06-07 12:39

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000012;
import irvine.oeis.a002.A002260;
import irvine.oeis.a004.A004736;
import irvine.oeis.a023.A023531;
import irvine.oeis.triangle.Product;

/**
 * A131783 A000012 * (A004736 + A002260 - I).
 * @author Georg Fischer
 */
public class A131783 extends Product {

  /** Construct the sequence. */
  public A131783() {
    super(1, new A000012(), new Sequence1() {
      private final A004736 mSeq1 = new A004736();
      private final A002260 mSeq2 = new A002260();
      private final A023531 mSeq3 = new A023531();

      @Override
      public Z next() {
        return mSeq1.next().add(mSeq2.next()).subtract(mSeq3.next());
      }
    });
  }
}
