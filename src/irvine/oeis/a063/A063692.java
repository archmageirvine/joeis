package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.ZeroSpacedSequence;
import irvine.oeis.a054.A054581;
import irvine.oeis.a058.A058866;

/**
 * A063692 Number of 2-trees rooted at a triangle with two similar edges.
 * @author Sean A. Irvine
 */
public class A063692 extends Sequence2 {

  // I could not get direct computation of 3.5.16 in Harary to work,
  // on instead computed here via 3.5.19.

  private final Sequence mT = new A054581().skip(1); // x + x^2 + 2x^3 + 5x^4 + ...

  private final Sequence mL = new A058866(); // x +2x^2 + 6x^3 + 21x^4 + ...
  private final Sequence mS2 = new ZeroSpacedSequence(new A063689(), 2); // x + x^4 + 2x^7 + 6x^10 + ...
  private final Sequence mDelta = new A063688(); // x + x^2 + 3x^3 + ...
  {
    next();
  }

  @Override
  public Z next() {
    return mT.next().subtract(mL.next()).subtract(mS2.next().multiply2()).add(mDelta.next().multiply2());
  }
}

