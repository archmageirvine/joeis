package irvine.oeis.a098;

import irvine.oeis.Egf;
import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a000.A000110;
import irvine.oeis.a014.A014500;

/**
 * A098620 Consider the family of multigraphs enriched by the species of set partitions. Sequence gives number of those multigraphs with n labeled edges.
 * @author Sean A. Irvine
 */
public class A098620 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A098620() {
    super(0, "[1]", "x,T,1,-,S", 0, EGF, 0, 0, Egf.wrap(new A014500()), Egf.wrap(new A000110()));
  }
}
