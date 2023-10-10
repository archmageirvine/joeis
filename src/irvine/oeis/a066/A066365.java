package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;

/**
 * A066365 The |sigma(n)-n|-perfect numbers, where f-perfect numbers for an arithmetical function f is defined in A066218.
 * @author Sean A. Irvine
 */
public class A066365 extends A066367 {

  /** Construct the sequence. */
  public A066365() {
    super(k -> Jaguar.factor(k).sigma().subtract(k).abs().longValueExact());
  }
}
