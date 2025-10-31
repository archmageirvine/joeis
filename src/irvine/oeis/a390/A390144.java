package irvine.oeis.a390;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A388853.
 * @author Sean A. Irvine
 */
public class A390144 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A390144() {
    super(1, ComputableReals.SINGLETON.acos(new PolynomialRootExpansionSequence(Polynomial.create(-43, -75, 27, 27), CR.NEG_ONE, CR.ZERO).getCR()));
  }
}

