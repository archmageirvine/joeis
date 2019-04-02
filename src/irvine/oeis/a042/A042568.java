package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042568 Numerators of continued fraction convergents to sqrt(813).
 * @author Sean A. Irvine
 */
public class A042568 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042568() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 4334, 0, 0, 0, 0, 0}, new long[] {28, 29, 57, 1055, 1112, 2167, 122464, 124631, 247095, 4572341, 4819436, 9391777});
  }
}
