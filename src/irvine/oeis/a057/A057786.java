package irvine.oeis.a057;

import irvine.math.lattice.Lattices;
import irvine.oeis.NaiveHunterSequence;

/**
 * A057786 Number of polykites with n cells.
 * @author Sean A. Irvine
 */
public class A057786 extends NaiveHunterSequence {

  /** Construct the sequence. */
  public A057786() {
    super(Lattices.KITE);
  }
}
