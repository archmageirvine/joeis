package irvine.oeis.a207;

import irvine.math.z.Z;
import irvine.oeis.a068.A068253;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A207993 Number of n X n 0..2 arrays with new values 0..2 introduced in row major order and no element equal to any horizontal or vertical neighbor (colorings ignoring permutations of colors).
 * @author Sean A. Irvine
 */
public class A207993 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A207993() {
    super(1, new A068253(), k -> Z.ONE.max(k.divide2()));
  }
}
