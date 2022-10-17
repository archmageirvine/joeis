package irvine.oeis.a259;
// manually A204574/parm3 at 2022-10-16 11:27

import irvine.oeis.a005.A005204;
import irvine.oeis.a204.A204574;
/**
 * A259883 A005204 written in base 2.
 * @author Georg Fischer
 */
public class A259883 extends A204574 {

  /** Construct the sequence. */
  public A259883() {
    super(0, new A005204(), 2);
  }
}
