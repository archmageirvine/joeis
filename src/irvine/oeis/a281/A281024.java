package irvine.oeis.a281;
// generated by patch_offset.pl at 2023-06-16 18:44

import irvine.math.z.Z;
import irvine.oeis.PartialProductSequence;
import irvine.oeis.a067.A067392;

/**
 * A281024 Partial products of A067392; a(1) = 1.
 * @author Georg Fischer
 */
public class A281024 extends PartialProductSequence {

  /** Construct the sequence. */
  public A281024() {
    super(1, new A067392() {
      private int mN = 0;

      @Override
      public Z next() {
        final Z result = super.next();
        return (++mN == 1) ? Z.ONE : result;
      }
    });
  }
}
