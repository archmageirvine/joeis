package irvine.oeis.a065;

import irvine.oeis.InverseSequence;

/**
 * A065288 Inverse permutation to A065287.
 * @author Sean A. Irvine
 */
public class A065288 extends InverseSequence {

  /** Construct the sequence. */
  public A065288() {
    super(1, new A065287(), 1);
  }
}
