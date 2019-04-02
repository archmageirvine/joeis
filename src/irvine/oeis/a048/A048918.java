package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A048918 9-gonal hexagonal numbers.
 * @author Sean A. Irvine
 */
public class A048918 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048918() {
    super(new long[] {1, -1, -4162056194L, 4162056194L, 1},
      new Z[] {
        Z.ONE,
        Z.valueOf(325),
        Z.valueOf(5330229625L),
        Z.valueOf(1353857339341L),
        new Z("22184715227362706161")
      });
  }
}
