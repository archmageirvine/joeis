package irvine.oeis.a070;

import irvine.oeis.FiniteSequence;

/**
 * A070294 Smallest k such that <code>k==i (mod(i!+1)) i=1,2,3,...,n</code>.
 * @author Georg Fischer
 */
public class A070294 extends FiniteSequence {

  /** Construct the sequence. */
  public A070294() {
    super(1, 5, 17, 479, 71879);
  }
}
