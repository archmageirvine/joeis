package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019752 G.f.: 1/((1-4x)(1-11x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A019752 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019752() {
    super(new long[] {528, -224, 27}, new long[] {1, 27, 505});
  }
}
