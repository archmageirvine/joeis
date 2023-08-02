package irvine.oeis.a130;
// manually sumdiv2/sumdiv at 2023-04-09 10:51

import irvine.math.z.Euler;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A130293 Number of necklaces of n beads with up to n colors, with cyclic permutation {1,..,n} of the colors taken to be equivalent.
 * @author Georg Fischer
 */
public class A130293 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A130293() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> Euler.phi(Z.valueOf(d)).multiply(d).multiply(Z.valueOf(mN).pow(mN / d))).divide((long) mN * mN);
  }
}
