package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017421 <code>(11n+2)^9</code>.
 * @author Sean A. Irvine
 */
public class A017421 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017421() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {512, 10604499373L, 2641807540224L, 78815638671875L, 922190162669056L, 6351461955384057L, 31087100296429568L, 119851595982618319L, 387420489000000000L, 1093685272684360901L});
  }
}
