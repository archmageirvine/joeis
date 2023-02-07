package irvine.oeis.a359;

import irvine.math.z.Z;

/**
 * A359736 allocated for M. F. Hasler.
 * @author Sean A. Irvine
 */
public class A359736 extends A359734 {

  /** Construct the sequence. */
  public A359736() {
    super(k -> Z.valueOf(k).square(), 0);
  }
}
