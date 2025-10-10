package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;

/**
 * A080972 a(n) = A080969(n)/A080967(A080979(A080970(n))).
 * @author Sean A. Irvine
 */
public class A080972 extends A080970 {

  private final DirectSequence mA080979 = DirectSequence.create(new A080979());
  private final DirectSequence mA080967 = DirectSequence.create(new A080967());
  private final Sequence mA080969 = new A080969();

  @Override
  public Z next() {
    return mA080969.next().divide(mA080967.a(mA080979.a(super.next())));
  }
}

