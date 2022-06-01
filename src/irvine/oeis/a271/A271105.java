package irvine.oeis.a271;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A271105 Square 1000-gonal numbers (or square chiliagonal numbers): numbers that are square and chiliagonal (or 1000-gonal).
 * @author Sean A. Irvine
 */
public class A271105 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271105() {
    super(new long[] {1, -1, 0, -6502873789598402L, 6502873789598402L, 0, 1},
      new Z[] {
        Z.ONE,
        Z.valueOf(2504902401L),
        Z.valueOf(168859192076889601L),
        Z.valueOf(241636344867909601L),
        new Z("16289064572957666645861601"),
        new Z("1098070014289567941239426235218401"),
        new Z("1571330653655890087598658185258401")
      });
  }
}
