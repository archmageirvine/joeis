package irvine.oeis.a182;

import irvine.math.z.Z;
import irvine.oeis.a212.A212220;

/**
 * A182553 Chromatic invariant of the complete tripartite graph K_(n,n,n).
 * @author Gregory Morse
 */
public class A182553 extends A212220 {
  private int mN = 0;

  /** Construct the sequence. */
  public A182553() {
    setOffset(1);
  }

  @Override
  public Z next() {
    return RING.eval(RING.diff(chromatic(++mN)), Z.ONE).abs();
  }
}
