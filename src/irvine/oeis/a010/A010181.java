package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010181.
 * @author Sean A. Irvine
 */
public class A010181 extends PrependSequence {

  /** Construct the sequence. */
  public A010181() {
    super(new PeriodicSequence(1, 3, 2, 1, 4, 1, 2, 3, 1, 20), Z.TEN);
  }
}

