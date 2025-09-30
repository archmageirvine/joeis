package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A080758.
 * @author Sean A. Irvine
 */
public class A080788 extends FilterSequence {

  /** Construct the sequence. */
  public A080788() {
    super(1, new A000040(), p -> (Functions.SYNDROME.i(p) & 0b0010111100) == 0 && new Z(Functions.REVERSE.z(p).toString().replace('6', 'x').replace('9', '6').replace('x', '9')).isProbablePrime());
  }
}
