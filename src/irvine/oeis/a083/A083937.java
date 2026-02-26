package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a014.A014486;
import irvine.oeis.a072.A072795;

/**
 * A083937 A014486-encodings of the plane binary trees and plane general trees whose left(most) subtree is just a "stick": \.
 * @author Sean A. Irvine
 */
public class A083937 extends A072795 {

  private final DirectSequence mA = DirectSequence.create(new A014486());

  @Override
  public Z next() {
    return mA.a(super.next());
  }
}
