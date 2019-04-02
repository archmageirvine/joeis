package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010222 Continued fraction for sqrt(178).
 * @author Sean A. Irvine
 */
public class A010222 extends PrependSequence {

  /** Construct the sequence. */
  public A010222() {
    super(new PeriodicSequence(2, 1, 12, 1, 2, 26), Z.valueOf(13));
  }
}

