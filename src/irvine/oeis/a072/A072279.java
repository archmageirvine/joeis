package irvine.oeis.a072;

import irvine.oeis.PrependSequence;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A072279 Dimension of n-th graded section of a certain Lie algebra.
 * @author Sean A. Irvine
 */
public class A072279 extends PrependSequence {

  /** Construct the sequence. */
  public A072279() {
    super(0, new InverseEulerTransform(new A072335().skip()), 1);
  }
}
