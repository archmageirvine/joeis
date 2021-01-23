package irvine.oeis.a006;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a001.A001951;

/**
 * A006337 An "eta-sequence": floor( (n+1)*sqrt(2) ) - floor( n*sqrt(2) ).
 * @author Sean A. Irvine
 */
public class A006337 extends DifferenceSequence {

  /** Construct the sequence. */
  public A006337() {
    super(new A001951());
    next();
  }
}

