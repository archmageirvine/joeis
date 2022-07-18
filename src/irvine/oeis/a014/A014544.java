package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a353.A353935;

/**
 * A014544 Numbers k such that a cube can be divided into k subcubes.
 * @author Sean A. Irvine
 */
public class A014544 extends ComplementSequence {

  /** Construct the sequence. */
  public A014544() {
    super(new A353935(), Z.ONE);
  }
}
