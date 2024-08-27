package irvine.oeis.a072;

import irvine.oeis.InverseSequence;

/**
 * A072009 Inverse of permutation A072007.
 * @author Sean A. Irvine
 */
public class A072009 extends InverseSequence {

  /** Construct the sequence. */
  public A072009() {
    super(0, new A072007(), 0);
  }
}
