package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160841 Expansion of (1+147*x+1230*x^2+1915*x^3+744*x^4+66*x^5+x^6)/(1-x)^7.
 * @author Sean A. Irvine
 */
public class A160841 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160841() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 154, 2287, 14725, 61147, 193546, 509293});
  }
}
