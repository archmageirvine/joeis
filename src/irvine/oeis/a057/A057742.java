package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a051.A051593;

/**
 * A057742 Maximal order of element of alternating group <code>A_{2n}</code>.
 * @author Sean A. Irvine
 */
public class A057742 extends A051593 {

  @Override
  public Z next() {
    final Z r = super.next();
    super.next();
    return r;
  }
}
