package irvine.oeis.a033;

import irvine.math.z.Z;

/**
 * A033956 Add <code>prime(n)</code> to <code>A033955</code>.
 * @author Sean A. Irvine
 */
public class A033956 extends A033955 {

  @Override
  public Z next() {
    return super.next().add(mP);
  }
}
