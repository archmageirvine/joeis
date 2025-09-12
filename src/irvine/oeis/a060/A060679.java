package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a003.A003277;

/**
 * A060679 Orders of non-cyclic groups.
 * @author Sean A. Irvine
 */
public class A060679 extends ComplementSequence {

  /** Construct the sequence. */
  public A060679() {
    super(Z.FOUR, new A003277());
  }
}
