package irvine.oeis.a177;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A177469 Expansion of (1-x+38*x^2-72*x^3-8*x^4+30*x^5) / (1-8*x -66*x^2 +280*x^3 +178*x^4 -532*x^5 -84*x^6 +108*x^7).
 * @author Sean A. Irvine
 */
public class A177469 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177469() {
    super(new long[] {-108, 84, 532, -178, -280, 66, 8}, new long[] {1, 7, 160, 1390, 19534, 202528, 2495596});
  }
}
