package irvine.oeis.a103;
// manually etman at 2023-02-01 22:30

import irvine.oeis.a010.A010056;
import irvine.oeis.ConstantFactorSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A103577 Number of partitions of n into Fibonacci parts if each part is of two kinds.
 * @author Georg Fischer
 */
public class A103577 extends EulerTransform {

  /** Construct the sequence. */
  public A103577() {
    super(0, new ConstantFactorSequence(new SkipSequence(new A010056(), 1), 2, 1), 1);
  }
}
