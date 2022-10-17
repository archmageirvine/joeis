package irvine.oeis.a287;
// manually A204574/parm3 at 2022-10-16 11:27

import irvine.oeis.a000.A000110;
import irvine.oeis.a204.A204574;
/**
 * A287014 Bell numbers written in base 2.
 * @author Georg Fischer
 */
public class A287014 extends A204574 {

  /** Construct the sequence. */
  public A287014() {
    super(0, new A000110(), 2);
  }
}
