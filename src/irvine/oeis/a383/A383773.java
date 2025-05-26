package irvine.oeis.a383;

import irvine.oeis.Combiner;
import irvine.oeis.a052.A052182;
import irvine.oeis.a085.A085719;

/**
 * A383773 a(n) = pos(M(n)), where M(n) is the n X n circulant matrix with (row 1) = (1, 2, ... , n), and pos(M(n)) is the positive part of the determinant of M(n); see A380661.
 * @author Sean A. Irvine
 */
public class A383773 extends Combiner {

  /** Construct the sequence. */
  public A383773() {
    super(1, new A052182(), new A085719().skip(), (det, perm) -> det.add(perm).divide2());
  }
}
