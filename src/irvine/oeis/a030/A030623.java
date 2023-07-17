package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000455;

/**
 * A030623 Powers of 2 grouped in pairs of 2 digits (version 2).
 * @author Sean A. Irvine
 */
public class A030623 extends A000455 {

  /** Construct the sequence. */
  public A030623() {
    super(1);
  }

  @Override
  public Z next() {
    return super.next().multiply(10).add(super.next());
  }
}

