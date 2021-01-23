package irvine.oeis.a137;

import irvine.math.z.Z;

/**
 * A137628 Semiprimes (p+4) associated with last prime in A137626.
 * @author Sean A. Irvine
 */
public class A137628 extends A137626 {

  @Override
  public Z next() {
    return super.next().add(4);
  }
}

