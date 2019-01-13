package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010223.
 * @author Sean A. Irvine
 */
public class A010223 extends PrependSequence {

  /** Construct the sequence. */
  public A010223() {
    super(new PeriodicSequence(2, 1, 1, 1, 3, 5, 13, 5, 3, 1, 1, 1, 2, 26), Z.valueOf(13));
  }
}

