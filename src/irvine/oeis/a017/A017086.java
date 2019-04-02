package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A017086 a(n) = (8*n + 1)^10.
 * @author Sean A. Irvine
 */
public class A017086 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017086() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11},
      new Z[] {Z.ONE, Z.valueOf(3486784401L), Z.valueOf(2015993900449L), Z.valueOf(95367431640625L), Z.valueOf(1531578985264449L), Z.valueOf(13422659310152401L), Z.valueOf(79792266297612001L), Z.valueOf(362033331456891249L), Z.valueOf(1346274334462890625L), Z.valueOf(4297625829703557649L), new Z("12157665459056928801")});
  }
}
