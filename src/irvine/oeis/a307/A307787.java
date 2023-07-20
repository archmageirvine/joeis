package irvine.oeis.a307;
// manually holom/holos at 2023-07-20 14:24

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A307787 Number of valid hook configurations of 132-avoiding permutations of [n].
 * @author Georg Fischer
 */
public class A307787 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A307787() {
    super(0, "[[0],[3098050560, 5290315776,-17139251200, 13538744320,-4332953600, 496738304],[-1217779200,-1936041216, 3180926720, 5358878080,-7218896000, 2031170816],[-415060800, 976489680, 1110020400,-2565675060,-823636560, 1722818820],[-17183760,-249009732,-286654300, 714804925, 1198175440, 416275187],[349232400, 618475320,-404046280,-1393690640,-920078720,-189863680]]",
      "[1, 1, 1, 2]", 1); // DIST=1 not in formula
  }
}
