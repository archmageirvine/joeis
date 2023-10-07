package irvine.oeis.a066;

import irvine.oeis.InverseSequence;

/**
 * A066249 Inverse permutation to A066248.
 * @author Sean A. Irvine
 */
public class A066249 extends InverseSequence {

  /** Construct the sequence. */
  public A066249() {
    super(1, new A066248());
  }
}
