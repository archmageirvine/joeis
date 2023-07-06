package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a106.A106594;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A031358 Number of coincidence site lattices of index 4n+1 in lattice Z^2.
 * @author Sean A. Irvine
 */
public class A031358 extends PrependSequence {

  /** Construct the sequence. */
  public A031358() {
    super(new SimpleTransformSequence(new A106594(), Z::multiply2), 1);
  }
}

