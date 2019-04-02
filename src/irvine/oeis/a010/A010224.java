package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010224 Continued fraction for sqrt(181).
 * @author Sean A. Irvine
 */
public class A010224 extends PrependSequence {

  /** Construct the sequence. */
  public A010224() {
    super(new PeriodicSequence(2, 4, 1, 8, 6, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 6, 8, 1, 4, 2, 26), Z.valueOf(13));
  }
}

