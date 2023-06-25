package irvine.oeis.a064;

import irvine.oeis.InverseSequence;
import irvine.oeis.a032.A032447;

/**
 * A064275 Inverse of sequence A032447 considered as a permutation of the positive integers.
 * @author Sean A. Irvine
 */
public class A064275 extends InverseSequence {

  /** Construct the sequence. */
  public A064275() {
    super(new A032447());
  }
}
