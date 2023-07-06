package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;

/**
 * A058387 Number of series-parallel networks with n unlabeled edges, multiple edges not allowed.
 * @author Sean A. Irvine
 */
public class A058387 extends PrependSequence {

  /** Construct the sequence. */
  public A058387() {
    super(new A058385() {
      @Override
      public Z next() {
        return super.next().multiply2();
      }
    }.skip(3), 0, 1, 1);
  }
}

