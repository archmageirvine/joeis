package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010230 Continued fraction for <code>sqrt(188)</code>.
 * @author Sean A. Irvine
 */
public class A010230 extends PrependSequence {

  /** Construct the sequence. */
  public A010230() {
    super(new PeriodicSequence(1, 2, 2, 6, 2, 2, 1, 26), Z.valueOf(13));
  }
}

