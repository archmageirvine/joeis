package irvine.oeis.a055;

import irvine.oeis.InverseSequence;
import irvine.oeis.a003.A003132;

/**
 * A055016 Smallest number whose sum of squares of digits is n.
 * @author Sean A. Irvine
 */
public class A055016 extends InverseSequence {

  /** Construct the sequence. */
  public A055016() {
    super(0, new A003132(), 0, 0);
  }
}
