package irvine.oeis.a055;

import irvine.oeis.HolonomicRecurrence;

/**
 * A055024 Number of 1-punctured staircase polygons (by perimeter) with a hole of perimeter 6.
 * @author Sean A. Irvine
 */
public class A055024 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055024() {
    super(0, "[[0],[745688868288,-321157909472,46032263328,-2195814592],[-344203922976,176212539392,-26614277952,1224661264],[38200186860,-28382358106,4517764722,-200615396],[0,1060816930,-185302923,7922123]]", "[0,0,0,0,0,0,0,0,0,0,2]", 0);
  }
}
