package irvine.oeis.a085;

import irvine.oeis.InverseSequence;

/**
 * A085164 Inverse permutation to A085163.
 * @author Sean A. Irvine
 */
public class A085164 extends InverseSequence {

  /** Construct the sequence. */
  public A085164() {
    super(0, 0, new A085163());
  }
}
