package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010145.
 * @author Sean A. Irvine
 */
public class A010145 extends PrependSequence {

  /** Construct the sequence. */
  public A010145() {
    super(new PeriodicSequence(1, 4, 3, 1, 2, 2, 1, 3, 4, 1, 14), Z.SEVEN);
  }
}

