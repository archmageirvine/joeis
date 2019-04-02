package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042139 Denominators of continued fraction convergents to sqrt(594).
 * @author Sean A. Irvine
 */
public class A042139 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042139() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2196610, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 8, 43, 1040, 5243, 11526, 16769, 45064, 2179841, 4404746, 6584587, 17573920, 94454187, 2284474408L, 11516826227L, 25318126862L, 36834953089L, 98988033040L});
  }
}
