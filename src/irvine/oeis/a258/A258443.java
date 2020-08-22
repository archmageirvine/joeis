package irvine.oeis.a258;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A258443 9-gonal numbers (A001106) that are the sum of eleven consecutive 9-gonal numbers.
 * @author Sean A. Irvine
 */
public class A258443 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258443() {
    super(new long[] {1, -1, -63043598, 63043598, 1},
      new Z[] {
        Z.valueOf(10039491),
        Z.valueOf(9002622519L),
        Z.valueOf(632913667646139L),
        Z.valueOf(567557703066557511L),
        new Z("39901154831776816303176")
      });
  }
}
