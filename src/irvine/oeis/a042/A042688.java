package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042688 Numerators of continued fraction convergents to <code>sqrt(874)</code>.
 * @author Sean A. Irvine
 */
public class A042688 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042688() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 7450, 0, 0, 0, 0, 0, 0, 0}, new long[] {29, 30, 59, 207, 473, 1626, 2099, 3725, 218149, 221874, 440023, 1541943, 3523909, 12113670, 15637579, 27751249});
  }
}
