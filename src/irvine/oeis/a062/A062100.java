package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A062100 Triangular numbers with every digit a triangular number.
 * @author Sean A. Irvine
 */
public class A062100 extends A000217 {

  /** Construct the sequence. */
  public A062100() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if ((Functions.SYNDROME.i(t) & 0b1110110100) == 0) {
        return t;
      }
    }
  }
}
