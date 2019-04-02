package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A017278 a(n) = (10*n)^10.
 * @author Sean A. Irvine
 */
public class A017278 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017278() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11},
      new Z[] {Z.ZERO, Z.valueOf(10000000000L), Z.valueOf(10240000000000L), Z.valueOf(590490000000000L), Z.valueOf(10485760000000000L), Z.valueOf(97656250000000000L), Z.valueOf(604661760000000000L), Z.valueOf(2824752490000000000L), new Z("10737418240000000000"), new Z("34867844010000000000"), new Z("100000000000000000000")});
  }
}
