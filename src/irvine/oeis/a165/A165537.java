package irvine.oeis.a165;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A165537 Number of permutations of length n which avoid the patterns 4213 and 2143.
 * @author Georg Fischer
 */
public class A165537 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A165537() {
    super(0, "[[0],[-105600, 18400,-800],[931040,-172640, 8000],[-3327520, 672888,-34008],[6675680,-1496008, 83768],[-8388072, 2110908,-132676],[6877616,-1970784, 140944],[-3713352, 1233126,-102070],[1303532,-513970, 50394],[-287438, 139273,-16711],[37300,-23376, 3600],[-2510, 2220,-474],[64,-98, 34],[0, 1,-1]]", "1, 1, 2, 6, 22, 88, 366, 1556, 6720, 29396, 129996, 580276, 2611290, 11834116, 53963190, 247414100, 1139860150, 5274189156", 0);
  }
}
