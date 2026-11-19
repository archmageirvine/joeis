package irvine.oeis.a329;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A329234 Number of digraphs on n unlabeled vertices such that every vertex has the same outdegree.
 * @author Gregory Morse
 */
public class A329234 extends A329228 {
  {
    setOffset(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return RING.eval(outdegrees(++mN), Q.ONE).toZ();
  }
}
