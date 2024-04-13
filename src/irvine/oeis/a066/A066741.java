package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000326;

/**
 * A066741 Pentagonal numbers not divisible by 10 whose reverse is a square.
 * @author Sean A. Irvine
 */
public class A066741 extends FilterSequence {

  /** Construct the sequence. */
  public A066741() {
    super(1, new A000326(), k -> {
      return k.isZero() || (k.mod(10) != 0 && Functions.REVERSE.z(k).isSquare());
    });
  }
}
