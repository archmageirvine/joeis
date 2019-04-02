package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112494 Sixth diagonal of the Stirling2 triangle A048993 and sixth column of triangle A008278.
 * @author Sean A. Irvine
 */
public class A112494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112494() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 63, 966, 7770, 42525, 179487, 627396, 1899612, 5135130, 12662650, 28936908});
  }
}
