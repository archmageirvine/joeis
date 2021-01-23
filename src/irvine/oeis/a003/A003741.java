package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A003741 Number of perfect matchings (or domino tilings) in O_5 X P_2n.
 * @author Sean A. Irvine
 */
public class A003741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003741() {
    super(new long[]{-1, 0, 65, 0, -548, 0, 995, 0, -548, 0, 65, 0},
      new long[]{0, 40, 0, 2197, 0, 121735, 0, 6748096, 0, 374079619, 0, 20737143595L}
    );
  }

  @Override
  public Z next() {
    super.next(); // skip zeros
    return super.next();
  }
}
