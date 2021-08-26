package irvine.oeis.a325;
// manually compseq at 2021-08-26 08:57

import irvine.oeis.ComplementSequence;
import irvine.oeis.a036.A036668;
/**
 * A325424 Complement of A036668: numbers not of the form 2^i*3^j*k, i + j even, (k,6) = 1.
 * @author Georg Fischer
 */
public class A325424 extends ComplementSequence {

  /** Construct the sequence. */
  public A325424() {
    super(new A036668());
    super.next();
  }
}
