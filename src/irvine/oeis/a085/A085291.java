package irvine.oeis.a085;

import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A085291 Decimal expansion of Alladi-Grinstead constant exp(c-1), where c is given in A085361.
 * @author Sean A. Irvine
 */
public class A085291 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A085291() {
    super(0, new A085361().getCR().subtract(1).exp());
  }
}
