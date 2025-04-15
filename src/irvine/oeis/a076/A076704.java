package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a053.A053810;

/**
 * A076704 Numbers k of the form p^q where both p and q are prime and all digits of k are odd.
 * @author Sean A. Irvine
 */
public class A076704 extends FilterSequence {

  /** Construct the sequence. */
  public A076704() {
    super(new A053810(), k -> (Functions.SYNDROME.i(k) & 0b10101010101) == 0);
  }
}
