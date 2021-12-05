package irvine.oeis.a098;

import irvine.math.z.BellNumbers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A098630 Consider the family of directed multigraphs enriched by the species of parts. Sequence gives number of those multigraphs with n labeled loops and arcs.
 * Sequence gives number of those multigraphs with n labeled loops and arcs
 * a(n) = 2^n*Bell(2*n).
 * @author Georg Fischer
 */
public class A098630 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return BellNumbers.bell(2 * mN).multiply(Z.ONE.shiftLeft(mN));
  }
}
