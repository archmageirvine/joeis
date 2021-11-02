package irvine.oeis.a098;
// manually trimultab/parm2 at 2021-11-02 22:29

import irvine.oeis.a030.A030190;
import irvine.oeis.a073.A073060;

/**
 * A098370 Multiplication table of the binary digits of the natural numbers read by antidiagonals.
 * @author Georg Fischer
 */
public class A098370 extends A073060 {

  /** Construct the sequence. */
  public A098370() {
    super(new A030190(), 1);
  }
}
