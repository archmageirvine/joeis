package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000583 Fourth powers: a(n) = n^4.
 * @author Sean A. Irvine
 */
public class A000583 extends AbstractSequence {

  /** Construct the sequence. */
  public A000583() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(4);
  }
}

