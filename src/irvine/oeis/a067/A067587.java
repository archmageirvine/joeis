package irvine.oeis.a067;

import irvine.oeis.InverseSequence;
import irvine.oeis.a066.A066884;

/**
 * A067587 Inverse of A066884 considered as a permutation of the positive integers.
 * @author Sean A. Irvine
 */
public class A067587 extends InverseSequence {

  /** Construct the sequence. */
  public A067587() {
    super(1, new A066884(), 1);
  }
}
