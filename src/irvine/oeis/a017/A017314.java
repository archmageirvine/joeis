package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A017314.
 * @author Sean A. Irvine
 */
public class A017314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017314() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11},
      new Z[] {Z.valueOf(59049), Z.valueOf(137858491849L), Z.valueOf(41426511213649L), Z.valueOf(1531578985264449L), Z.valueOf(21611482313284249L), Z.valueOf(174887470365513049L), Z.valueOf(984930291881790849L), Z.valueOf(4297625829703557649L), new Z("15516041187205853449"), new Z("48398230717929318249"), new Z("134391637934412192049")});
  }
}
