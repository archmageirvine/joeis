package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A017134.
 * @author Sean A. Irvine
 */
public class A017134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017134() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11},
      new Z[] {Z.valueOf(9765625), Z.valueOf(137858491849L), Z.valueOf(16679880978201L), Z.valueOf(420707233300201L), Z.valueOf(4808584372417849L), Z.valueOf(34050628916015625L), Z.valueOf(174887470365513049L), Z.valueOf(713342911662882601L), Z.valueOf(2446194060654759801L), Z.valueOf(7326680472586200649L), new Z("19687440434072265625")});
  }
}
