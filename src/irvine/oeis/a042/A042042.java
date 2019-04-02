package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042042 Numerators of continued fraction convergents to sqrt(545).
 * @author Sean A. Irvine
 */
public class A042042 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042042() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 3922, 0, 0, 0, 0, 0}, new long[] {23, 47, 70, 607, 677, 1961, 90883, 183727, 274610, 2380607, 2655217, 7691041});
  }
}
