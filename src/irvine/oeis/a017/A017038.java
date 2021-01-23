package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017038 a(n) = (7*n + 4)^10.
 * @author Sean A. Irvine
 */
public class A017038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017038() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1048576, 25937424601L, 3570467226624L, 95367431640625L, 1125899906842624L, 8140406085191601L, 42420747482776576L, 174887470365513049L, 604661760000000000L, 1822837804551761449L, 4923990397355877376L});
  }
}
