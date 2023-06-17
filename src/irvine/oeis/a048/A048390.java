package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A048390 Digits d in decimal expansion of n replaced with d^3.
 * @author Sean A. Irvine
 */
public class A048390 extends AbstractSequence {

  /* Construct the sequence. */
  public A048390() {
    super(0);
  }

  static final String[] EXPANSIONS = {
    "0",
    "1",
    "8",
    "72", // we do a reverse later!
    "46",
    "521",
    "612",
    "343",
    "215",
    "927"
  };
  private long mN = -1;

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder();
    long m = ++mN;
    do {
      sb.append(EXPANSIONS[(int) (m % 10)]);
      m /= 10;
    } while (m != 0);
    return new Z(sb.reverse());
  }
}
