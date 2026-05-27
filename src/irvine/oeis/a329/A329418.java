package irvine.oeis.a329;

import irvine.oeis.FiniteSequence;

/**
 * A329418 Lazy caterer's numbers (A000124) that are also cake numbers (A000125).
 * @author Sean A. Irvine
 */
public class A329418 extends FiniteSequence {

  /** Construct the sequence. */
  public A329418() {
    super(1, FINITE, 1, 2, 4, 232, 15226);
  }
}
