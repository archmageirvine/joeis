package irvine.oeis.a064;

import irvine.oeis.InverseSequence;

/**
 * A064421 Term at which n appears in A064413 (if it begins at 2).
 * @author Sean A. Irvine
 */
public class A064421 extends InverseSequence {

  /** Construct the sequence. */
  public A064421() {
    super(1, new A064413(), 1, 0);
  }
}
