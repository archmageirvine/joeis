package irvine.oeis.a264;
// manually A204574/parm3 at 2022-10-16 11:27

import irvine.oeis.a000.A000108;
import irvine.oeis.a204.A204574;
/**
 * A264663 Catalan numbers written in base 2.
 * @author Georg Fischer
 */
public class A264663 extends A204574 {

  /** Construct the sequence. */
  public A264663() {
    super(0, new A000108(), 2);
  }
}
