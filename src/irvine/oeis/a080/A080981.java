package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a014.A014486;

/**
 * A080981 A014486-encodings of the trees whose interior zigzag-tree (Stanley's c) is branch-reduced (in the sense defined by Donaghey).
 * @author Sean A. Irvine
 */
public class A080981 extends A080980 {

  private final DirectSequence mA = DirectSequence.create(new A014486());

  @Override
  public Z next() {
    return mA.a(super.next());
  }
}

