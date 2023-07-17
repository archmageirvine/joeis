package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000455;

/**
 * A030622 Powers of 2 grouped in pairs of two digits (version 1).
 * @author Sean A. Irvine
 */
public class A030622 extends A000455 {

  /** Construct the sequence. */
  public A030622() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().multiply(10).add(super.next());
  }
}

