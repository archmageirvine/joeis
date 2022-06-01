package irvine.oeis.a055;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A055022 Number of 1-punctured staircase polygons (by perimeter) with a hole of perimeter 4.
 * @author Sean A. Irvine
 */
public class A055022 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055022() {
    super(0, "[[0],[360,-152,16],[-90,70,-8],[0,-8,1]]", "[0,0,0,0,0,0,0,0,1]", 0);
  }
}
