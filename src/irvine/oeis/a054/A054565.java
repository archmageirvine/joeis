package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a000.A000244;

/**
 * A054565 Numbers n such that 3 is the first digit of 3^n.
 * @author Sean A. Irvine
 */
public class A054565 extends A000244 {

  /** Construct the sequence. */
  public A054565() {
    super(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().toString().startsWith("3")) {
        return Z.valueOf(mN);
      }
    }
  }
}
