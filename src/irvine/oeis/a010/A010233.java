package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010233.
 * @author Sean A. Irvine
 */
public class A010233 extends PrependSequence {

  /** Construct the sequence. */
  public A010233() {
    super(new PeriodicSequence(1, 4, 1, 1, 3, 2, 2, 13, 2, 2, 3, 1, 1, 4, 1, 26), Z.valueOf(13));
  }
}

