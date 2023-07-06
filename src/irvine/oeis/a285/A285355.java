package irvine.oeis.a285;
// manually rootet at 2023-02-21 21:45

import irvine.math.z.Z;
import irvine.oeis.a112.A112274;
import irvine.oeis.transform.RootSequence;

/**
 * A285355 Convolution square of A112274.
 * @author Georg Fischer
 */
public class A285355 extends RootSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A285355() {
    super(0, new A112274().skip(1), 2, 1);
  }

  @Override
  public Z next() {
    return (++mN <= 1) ? Z.ZERO : super.next();
  }
}
