package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.a003.A003681;

/**
 * A082124 Smallest difference&gt;1 between d and p/d for any divisor d of the partial product p of the sequence, starting with 9.
 * @author Sean A. Irvine
 */
public class A082124 extends A003681 {

  /** Construct the sequence. */
  public A082124() {
    super(1, Z.NINE, Z.EIGHT);
  }
}
