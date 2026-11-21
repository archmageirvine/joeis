package irvine.oeis.a372;

import irvine.math.z.Z;
import irvine.oeis.a212.A212084;

/**
 * A372261 Number T(n,k,j) of acyclic orientations of the complete tripartite graph K_{n,k,j}; triangle of triangles T(n,k,j), n&gt;=0, k=0..n, j=0..k, read by rows.
 * @author Gregory Morse
 */
public class A372261 extends A212084 {
  private int mN = 0;
  private int mK = 0;
  private int mJ = -1;

  @Override
  public Z next() {
    if (++mJ > mK) {
      if (++mK > mN) {
        ++mN;
        mK = 0;
      }
      mJ = 0;
    }
    return orientations(mN, mK, mJ);
  }
}
