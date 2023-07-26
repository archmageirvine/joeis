package irvine.oeis.a064;

import irvine.oeis.InverseSequence;

/**
 * A064745 Inverse permutation to A064736.
 * @author Sean A. Irvine
 */
public class A064745 extends InverseSequence {

  /** Construct the sequence. */
  public A064745() {
    super(1, new A064736());
  }
}

