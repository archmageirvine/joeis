package irvine.oeis.a120;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A120469 Expansion of -(20*x^12 + 184*x^11 + 121*x^10 - 915*x^9 -1 524*x^8 - 132*x^7 + 1068*x^6 + 581*x^5 - 71*x^4 - 112*x^3 - 14*x^2 + 5*x +1) / ((3*x +1) * (16*x^12 + 140*x^11 + 2*x^10 - 968*x^9 - 830*x^8 + 946*x^7 + 982*x^6 - 239*x^5 - 351*x^4 - 5*x^3 + 39*x^2 + 3*x -1)).
 * @author Sean A. Irvine
 */
public class A120469 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120469() {
    super(new long[] {48, 436, 146, -2902, -3458, 2008, 3892, 265, -1292, -366, 112, 48, 0}, new long[] {1, 5, 34, 240, 1755, 12787, 93549, 683653, 4999040, 36546925, 267210674, 1953631757, 14283593763L});
  }
}
