package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001203 Simple continued fraction expansion of Pi.
 * @author Sean A. Irvine
 */
public class A001203 extends AbstractSequence {

  /* Construct the sequence. */
  public A001203() {
    super(0);
  }

  private CR mU = CR.PI;

  @Override
  public Z next() {
    final Z a = mU.floor();
    final CR d = mU.subtract(CR.valueOf(a));
    mU = d.inverse();
    return a;
  }
}
