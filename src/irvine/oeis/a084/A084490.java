package irvine.oeis.a084;

import irvine.oeis.InverseSequence;

/**
 * A084490 Inverse permutation to A084489.
 * @author Sean A. Irvine
 */
public class A084490 extends InverseSequence {

  /** Construct the sequence. */
  public A084490() {
    super(1, 1, new A084489(), 1);
  }
}
