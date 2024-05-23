package irvine.oeis.a069;

import irvine.oeis.InverseSequence;

/**
 * A069776 Permutation of natural numbers induced by the automorphism gma069776! acting on the parenthesizations encoded by A014486.
 * @author Sean A. Irvine
 */
public class A069776 extends InverseSequence {

  /** Construct the sequence. */
  public A069776() {
    super(0, new A069775(), 0);
  }
}
