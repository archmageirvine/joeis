package irvine.oeis.a056;
// manually A060164/parm2 at 2022-03-25 11:59

import irvine.oeis.PrependSequence;
import irvine.oeis.a027.A027383;

/**
 * A056498 Number of primitive (period n) periodic palindromes using exactly two different symbols.
 * @author Georg Fischer
 */
public class A056498 extends A056267 {

  /** Construct the sequence. */
  public A056498() {
    super(new PrependSequence(new A027383(), 0, 0));
  }
}
