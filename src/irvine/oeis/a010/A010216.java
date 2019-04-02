package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010216 Continued fraction for sqrt(172).
 * @author Sean A. Irvine
 */
public class A010216 extends PrependSequence {

  /** Construct the sequence. */
  public A010216() {
    super(new PeriodicSequence(8, 1, 2, 2, 1, 1, 3, 6, 3, 1, 1, 2, 2, 1, 8, 26), Z.valueOf(13));
  }
}

