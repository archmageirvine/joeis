package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107941 <code>a(n) = (n+1)(n+2)^2*(n+3)^2*(n+4)^2*(n+5)(3n^2 + 13n + 15)/43200</code>.
 * @author Sean A. Irvine
 */
public class A107941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107941() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 31, 371, 2646, 13524, 54684, 185724, 551034, 1467609, 3578575, 8107099});
  }
}
