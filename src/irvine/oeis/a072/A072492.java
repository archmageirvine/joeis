package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A072492 Values of n for which A072491(n)=3.
 * @author Sean A. Irvine
 */
public class A072492 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A072492() {
    super(1, 0, new A072491(), Z.THREE::equals);
  }
}

