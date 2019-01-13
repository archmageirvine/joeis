package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010235.
 * @author Sean A. Irvine
 */
public class A010235 extends PrependSequence {

  /** Construct the sequence. */
  public A010235() {
    super(new PeriodicSequence(1, 8, 3, 2, 1, 3, 3, 1, 2, 3, 8, 1, 26), Z.valueOf(13));
  }
}

