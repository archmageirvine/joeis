package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042190 Numerators of continued fraction convergents to sqrt(620).
 * @author Sean A. Irvine
 */
public class A042190 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042190() {
    super(new long[] {-1, 0, 0, 0, 498, 0, 0, 0}, new long[] {24, 25, 224, 249, 12176, 12425, 111576, 124001});
  }
}
