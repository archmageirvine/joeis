package irvine.oeis.a212;
// manually 2020-12-30

import irvine.oeis.HolonomicRecurrence;

/**
 * A212916 Number of standard Young tableaux of n cells and height &lt;= 10.
 * @author Georg Fischer
 */
public class A212916 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A212916() {
    super(0, "[[0],[-1728000, 3945600, -3240000, 1224000, -216000, 14400],[518400, -1080000, 756000, -216000, 21600],[1666080, -2591856, 842800, 139360, -52240, -4144],[-948240, 1231704, -196424, -82896, -4144],[-977400, 240516, 616460, 113312, 6972, 140],[1656000, 685800, 84986, 4144, 70],[-1814400, -549576, -63405, -3523, -95, -1]]", "[1, 1, 2, 4, 10, 26]" , 0);
  }
}
