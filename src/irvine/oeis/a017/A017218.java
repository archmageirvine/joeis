package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A017218 a(n) = (9*n + 4)^10.
 * @author Sean A. Irvine
 */
public class A017218 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017218() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11},
      new Z[] {Z.valueOf(1048576), Z.valueOf(137858491849L), Z.valueOf(26559922791424L), Z.valueOf(819628286980801L), Z.valueOf(10485760000000000L), Z.valueOf(79792266297612001L), Z.valueOf(430804206899405824L), Z.valueOf(1822837804551761449L), Z.valueOf(6428888932339941376L), new Z("19687440434072265625"), new Z("53861511409489970176")});
  }
}
