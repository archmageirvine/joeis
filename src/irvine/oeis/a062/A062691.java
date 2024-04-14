package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A062691 Triangular numbers that contain exactly 2 different digits.
 * @author Sean A. Irvine
 */
public class A062691 extends A000217 {

  /** Construct the sequence. */
  public A062691() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Integer.bitCount(Functions.SYNDROME.i(t)) == 2) {
        return t;
      }
    }
  }
}
