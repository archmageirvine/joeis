package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010228 Continued fraction for <code>sqrt(186)</code>.
 * @author Sean A. Irvine
 */
public class A010228 extends PrependSequence {

  /** Construct the sequence. */
  public A010228() {
    super(new PeriodicSequence(1, 1, 1, 3, 4, 3, 1, 1, 1, 26), Z.valueOf(13));
  }
}

