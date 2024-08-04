package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a002.A002262;
import irvine.oeis.a025.A025581;

/**
 * A071673 Sequence a(n) obtained by setting a(0) = 0; then reading the table T(x,y)=a(x)+a(y)+1 in antidiagonal fashion.
 * @author Sean A. Irvine
 */
public class A071673 extends CachedSequence {

  private static final DirectSequence A025581 = DirectSequence.create(new A025581());
  private static final DirectSequence A002262 = DirectSequence.create(new A002262());

  /** Construct the sequence. */
  public A071673() {
    super(0, Integer.class, (self, n) -> n == 0 ? Z.ZERO : self.a(A025581.a(n - 1).intValueExact()).add(self.a(A002262.a(n - 1).intValueExact())).add(1));
  }
}
