package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042711.
 * @author Sean A. Irvine
 */
public class A042711 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042711() {
    super(new long[] {-1, 0, 0, 0, 238, 0, 0, 0}, new long[] {1, 1, 3, 4, 235, 239, 713, 952});
  }
}
