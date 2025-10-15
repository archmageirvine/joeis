package irvine.oeis.a075;

import irvine.oeis.InverseSequence;

/**
 * A075303 Inverse permutation to A075302.
 * @author Sean A. Irvine
 */
public class A075303 extends InverseSequence {

  /** Construct the sequence. */
  public A075303() {
    super(0, 0, new A075302());
  }
}
