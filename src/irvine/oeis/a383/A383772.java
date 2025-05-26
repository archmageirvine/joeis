package irvine.oeis.a383;

import irvine.oeis.Combiner;
import irvine.oeis.a052.A052182;
import irvine.oeis.a085.A085719;

/**
 * A383772 a(n) = neg(M(n)), where M(n) is the n X n circulant matrix with (row 1) = (1, 2, ... , n), and neg(M(n)) is the negative part of the determinant of M(n); see A380661.
 * @author Sean A. Irvine
 */
public class A383772 extends Combiner {

  /** Construct the sequence. */
  public A383772() {
    super(1, new A052182(), new A085719().skip(), (det, perm) -> det.subtract(perm).divide2());
  }
}
