package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.oeis.a000.A000312;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A068741 a(n) = (n^n)!.
 * @author Georg Fischer
 */
public class A068741 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A068741() {
    super(0, new A000312(), Functions.FACTORIAL::z);
  }
}
