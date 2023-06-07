package irvine.oeis.a133;
// manually trisum/trisum3 at 2023-06-07 12:39

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007318;
import irvine.oeis.a023.A023531;
import irvine.oeis.a097.A097806;
import irvine.oeis.triangle.Product;

/**
 * A133807 A007318 * (A097806 + A133566 - I), where I is the identity matrix.
 * @author Georg Fischer
 */
public class A133807 extends Product {

  /** Construct the sequence. */
  public A133807() {
    super(1, new A007318(), new Sequence1() {
      private final A097806 mSeq1 = new A097806();
      private final A133566 mSeq2 = new A133566();
      private final A023531 mSeq3 = new A023531();

      @Override
      public Z next() {
        return mSeq1.next().add(mSeq2.next()).subtract(mSeq3.next());
      }
    });
  }
}
