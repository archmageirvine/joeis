package irvine.oeis.a278;

import irvine.oeis.LinearRecurrence;

/**
 * A278579 Quadratic non-residues of <code>23</code>: numbers n such that <code>Jacobi(n,23) = -1</code>.
 * @author Sean A. Irvine
 */
public class A278579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278579() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {5, 7, 10, 11, 14, 15, 17, 19, 20, 21, 22, 28});
  }
}
