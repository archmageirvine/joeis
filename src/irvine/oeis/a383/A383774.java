package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.Combiner;
import irvine.oeis.a052.A052182;
import irvine.oeis.a085.A085719;

/**
 * A383774 a(n) = neg(M(n)), where M(n) is the n X n left circulant matrix with (row 1) = (1, 2, ... , n), and neg(M(n)) is the negative part of the determinant of M(n); see A380661.
 * @author Sean A. Irvine
 */
public class A383774 extends Combiner {

  /** Construct the sequence. */
  public A383774() {
    super(1, new A052182() {

      private int mN = -1;

      @Override
      public Z next() {
        return super.next().multiply(Z.NEG_ONE.pow(++mN / 2));
      }
    }, new A085719().skip(), (det, perm) -> det.subtract(perm).divide2());
  }
}
