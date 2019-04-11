package irvine.oeis.a110;

import irvine.oeis.FiniteSequence;

/**
 * A110839 Weight enumerator of <code>[16,15,2]</code> even weight code (the Reed-Muller code RM(3,4)).
 * @author Georg Fischer
 */
public class A110839 extends FiniteSequence {

  /** Construct the sequence. */
  public A110839() {
    super(1, 120, 1820, 8008, 12870, 8008, 1820, 120, 1);
  }
}
