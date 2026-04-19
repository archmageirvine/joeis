package irvine.oeis.a084;

import irvine.oeis.InverseSequence;

/**
 * A084462 Inverse permutation to A084461.
 * @author Sean A. Irvine
 */
public class A084462 extends InverseSequence {

  /** Construct the sequence. */
  public A084462() {
    super(1, 1, new A084461(), 1);
  }
}
