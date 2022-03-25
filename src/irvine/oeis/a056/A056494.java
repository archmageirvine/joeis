package irvine.oeis.a056;
// manually A060164/parm2 at 2022-03-25 11:59

import irvine.oeis.SkipSequence;
import irvine.oeis.a038.A038754;

/**
 * A056494 Number of primitive (period n) periodic palindromes using a maximum of three different symbols.
 * @author Georg Fischer
 */
public class A056494 extends A056267 {

  /** Construct the sequence. */
  public A056494() {
    super(new SkipSequence(new A038754(), 1));
  }
}
