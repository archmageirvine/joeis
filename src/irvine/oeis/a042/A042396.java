package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042396 Numerators of continued fraction convergents to sqrt(725).
 * @author Sean A. Irvine
 */
public class A042396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042396() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 19602, 0, 0, 0, 0, 0}, new long[] {26, 27, 350, 727, 9074, 9801, 518726, 528527, 6861050, 14250627, 177868574, 192119201});
  }
}
