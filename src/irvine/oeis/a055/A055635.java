package irvine.oeis.a055;

import irvine.oeis.InverseSequence;
import irvine.oeis.a003.A003263;

/**
 * A055635 Smallest number that can be expressed as the sum of distinct Lucas numbers (A000204) in exactly n ways.
 * @author Sean A. Irvine
 */
public class A055635 extends InverseSequence {

  /** Construct the sequence. */
  public A055635() {
    super(new A003263());
  }
}

