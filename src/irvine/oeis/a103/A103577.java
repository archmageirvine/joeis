package irvine.oeis.a103;
// manually etman at 2023-02-01 22:30

import irvine.math.z.Z;
import irvine.oeis.a010.A010056;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A103577 Number of partitions of n into Fibonacci parts if each part is of two kinds.
 * @author Georg Fischer
 */
public class A103577 extends EulerTransform {

  /** Construct the sequence. */
  public A103577() {
    super(0, new SimpleTransformSequence(new A010056().skip(), Z::multiply2), 1);
  }
}
