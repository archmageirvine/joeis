package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A058387 Number of series-parallel networks with n unlabeled edges, multiple edges not allowed.
 * @author Sean A. Irvine
 */
public class A058387 extends PrependSequence {

  /** Construct the sequence. */
  public A058387() {
    super(new SimpleTransformSequence(new A058385().skip(3), Z::multiply2), 0, 1, 1);
  }
}

