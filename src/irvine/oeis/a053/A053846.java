package irvine.oeis.a053;

import irvine.oeis.PrependSequence;

/**
 * A053846 Number of n X n matrices over GF(3) of order dividing 2 (i.e., number of solutions of X^2=I in GL(n,3)).
 * @author Sean A. Irvine
 */
public class A053846 extends PrependSequence {

  /** Construct the sequence. */
  public A053846() {
    super(new A053849(3L, 1, 1), 1);
  }
}
