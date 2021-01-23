package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A037046 Numbers that are not the number of quadratic residues mod n for any n.
 * @author Sean A. Irvine
 */
public class A037046 extends ComplementSequence {

  /** Construct the sequence. */
  public A037046() {
    super(new A037041(), Z.FIVE);
  }
}
