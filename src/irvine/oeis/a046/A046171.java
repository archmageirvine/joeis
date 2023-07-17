package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a001.A001411;

/**
 * A046171 Number of inequivalent self-avoiding walks of length n on a 2-D lattice which start at origin, take first step in {+1,0} direction and if any steps are vertical, a step up is taken before a step down.
 * @author Sean A. Irvine
 */
public class A046171 extends A001411 {

  /** Construct the sequence. */
  public A046171() {
    super(1);
  }

  {
    super.next(); // skip 0
  }

  @Override
  public Z next() {
    return super.next().add(4).divide(8);
  }
}
