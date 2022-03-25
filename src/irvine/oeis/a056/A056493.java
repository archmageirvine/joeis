package irvine.oeis.a056;
// manually A060164/parm2 at 2022-03-25 11:59

import irvine.oeis.SkipSequence;
import irvine.oeis.a029.A029744;

/**
 * A056493 Number of primitive (period n) periodic palindromes using a maximum of two different symbols.
 * @author Georg Fischer
 */
public class A056493 extends A056271 {

  /** Construct the sequence. */
  public A056493() {
    super(new SkipSequence(new A029744(), 1));
  }
}
