package irvine.oeis.a035;
// Manually adapted from A035456 2020-09.03

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A035457 Number of partitions of n into parts of the form 4*k + 2.
 * @author Georg Fischer
 */
public class A035457 extends PrependSequence {

  /** Construct the sequence. */
  public A035457() {
    super(new EulerTransform(new PeriodicSequence(0, 1, 0, 0), new Z[0]), 1);
  }
}
