package irvine.oeis.a220;

import irvine.oeis.FiniteSequence;

/**
 * A220111 Main diagonal of array T(k,n) = n-th number in which the number of distinct base 10 digits is k.
 * @author Georg Fischer
 */
public class A220111 extends FiniteSequence {

  /** Construct the sequence. */
  public A220111() {
    super(0, 12, 104, 1026, 10238, 102354, 1023468, 10234587, 1023457869L);
  }
}
