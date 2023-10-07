package irvine.oeis.a066;

import irvine.oeis.InverseSequence;

/**
 * A066251 Inverse permutation to A066250.
 * @author Sean A. Irvine
 */
public class A066251 extends InverseSequence {

  /** Construct the sequence. */
  public A066251() {
    super(1, new A066250());
  }
}
