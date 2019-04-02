package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A017398 a(n) = (11*n)^10.
 * @author Sean A. Irvine
 */
public class A017398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017398() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11},
      new Z[] {Z.ZERO, Z.valueOf(25937424601L), Z.valueOf(26559922791424L), Z.valueOf(1531578985264449L), Z.valueOf(27197360938418176L), Z.valueOf(253295162119140625L), Z.valueOf(1568336880910795776L), Z.valueOf(7326680472586200649L), new Z("27850097600940212224"), new Z("90438207500880449001"), new Z("259374246010000000000")});
  }
}
