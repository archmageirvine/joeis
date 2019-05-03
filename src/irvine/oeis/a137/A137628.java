package irvine.oeis.a137;

import irvine.math.z.Z;

/**
 * A137628 Semiprimes <code>(p+4)</code> associated with last prime in <code>A137626</code>.
 * @author Sean A. Irvine
 */
public class A137628 extends A137626 {

  @Override
  public Z next() {
    return super.next().add(4);
  }
}

