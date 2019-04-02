package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042728 Numerators of continued fraction convergents to sqrt(894).
 * @author Sean A. Irvine
 */
public class A042728 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042728() {
    super(new long[] {-1, 0, 0, 0, 598, 0, 0, 0}, new long[] {29, 30, 269, 299, 17611, 17910, 160891, 178801});
  }
}
