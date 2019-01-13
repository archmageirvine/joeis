package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244880.
 * @author Sean A. Irvine
 */
public class A244880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244880() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 47, 650, 4726, 23219, 87677, 274132, 743724, 1806597});
  }
}
