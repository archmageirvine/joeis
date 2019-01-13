package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A017230.
 * @author Sean A. Irvine
 */
public class A017230 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017230() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11},
      new Z[] {Z.valueOf(9765625), Z.valueOf(289254654976L), Z.valueOf(41426511213649L), Z.valueOf(1125899906842624L), Z.valueOf(13422659310152401L), Z.valueOf(97656250000000000L), Z.valueOf(511116753300641401L), Z.valueOf(2113922820157210624L), Z.valueOf(7326680472586200649L), new Z("22130157888803070976"), new Z("59873693923837890625")});
  }
}
