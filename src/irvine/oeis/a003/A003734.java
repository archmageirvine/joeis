package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A003734 Number of spanning trees with degrees 1 and 3 in <code>C_5 X P_2n</code>.
 * @author Sean A. Irvine
 */
public class A003734 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003734() {
    super(new long[] {0, 0, 32768, 0, -307200, 0, -1695488, 0, -2291392, 0, -1265216, 0, 338976, 0, -26648, 0, 160624, 0, -234, 0, -4916, 0, -745, 0, 98, 0},
      new Z[] {
        Z.ZERO,
        Z.ZERO,
        Z.ZERO,
        Z.valueOf(260),
        Z.ZERO,
        Z.valueOf(27420),
        Z.ZERO,
        Z.valueOf(2504560),
        Z.ZERO,
        Z.valueOf(223723080),
        Z.ZERO,
        Z.valueOf(19923617840L),
        Z.ZERO,
        Z.valueOf(1773563554900L),
        Z.ZERO,
        Z.valueOf(157870122686600L),
        Z.ZERO,
        Z.valueOf(14052371971981100L),
        Z.ZERO,
        Z.valueOf(1250831588811052320L),
        Z.ZERO,
        new Z("111339169110472830220"),
        Z.ZERO,
        new Z("9910535055491682625400"),
        Z.ZERO,
        new Z("882157695038695625086700")}
    );
  }

  @Override
  public Z next() {
    super.next(); // skip zeros
    return super.next();
  }
}
