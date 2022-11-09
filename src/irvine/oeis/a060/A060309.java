package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001067;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A060309 A001067 appears to count the periodic points for a certain map. If so, then this is the sequence of the numbers of orbits of length n.
 * @author Sean A. Irvine
 */
public class A060309 extends MobiusTransformSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A060309() {
    super(new PrependSequence(new A001067(), 1), 1);
    super.next();
  }

  @Override
  public Z next() {
    final Z t = super.next();
    return ++mN == 2 ? Z.ZERO : t.abs().divide(mN);
  }
}
