package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259321 <code>a(n) = A259110(n)*A259323(n) - A259319(n)^2</code>.
 * @author Sean A. Irvine
 */
public class A259321 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259321() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 2304, 290304, 6386688, 65235456, 424030464, 2038772736, 7894388736L, 25960393728L, 75123949824L, 196144058880L});
  }
}
