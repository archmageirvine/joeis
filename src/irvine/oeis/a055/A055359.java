package irvine.oeis.a055;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A055359 Number of increasing mobiles (circular rooted trees) with n nodes and 5 leaves.
 * @author Georg Fischer
 */
public class A055359 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055359() {
    super(6, A055357.computeRecurrence(5), "24, 600, 8244, 83500, 701164, 5191412, 35160560, 223072440, 1347354144, 7836767696, 44262649196, 244280080420, 1323563238484, 7066323307308, 37279810191336, 194788586755056, 1009815185486280, 5201560257678600, 26652801813464100, 135981081575053980");
  }
}

