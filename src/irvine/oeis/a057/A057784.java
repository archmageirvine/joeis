package irvine.oeis.a057;

import irvine.math.lattice.Lattices;
import irvine.oeis.NaiveHunterSequence;

/**
 * A057784 Number of polypons with n cells.
 * @author Sean A. Irvine
 */
public class A057784 extends NaiveHunterSequence {

  /** Construct the sequence. */
  public A057784() {
    super(Lattices.PON);
  }
}
