package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a106.A106594;

/**
 * A031358 Number of coincidence site lattices of index <code>4n+1</code> in lattice <code>Z^2</code>.
 * @author Sean A. Irvine
 */
public class A031358 extends PrependSequence {

  /** Construct the sequence. */
  public A031358() {
    super(new A106594() {
      @Override
      public Z next() {
        return super.next().multiply2();
      }
    }, 1);
  }
}

