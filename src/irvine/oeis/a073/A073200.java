package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001477;
import irvine.oeis.a057.A057163;
import irvine.oeis.a057.A057509;
import irvine.oeis.a057.A057510;
import irvine.oeis.a057.A057511;
import irvine.oeis.a057.A057512;
import irvine.oeis.a069.A069767;
import irvine.oeis.a069.A069768;
import irvine.oeis.a069.A069770;
import irvine.oeis.a072.A072796;

/**
 * A073200 Number of simple Catalan bijections of type B.
 * @author Sean A. Irvine
 */
public class A073200 extends Sequence0 {

  // This sequence is insanely complicated to understand.
  // It's actually a table read by antidiagonals.
  // Here I've directly used known rows, so it runs out information at term 252

  private final Sequence[] mRows = {
    new A069770(),
    new A072796(),
    new A057163(),
    new A073269(),
    new A057163(),
    new A073270(),
    new A069767(),
    new A001477(),
    new A069768(),
    new A073280(),
    new A069770(),
    new A072796(),
    new A057511(),
    new A073282(),
    new A057512(),
    new A073281(),
    new A057509(),
    new A073280(),
    new A057510(),
    new A073283(),
    new A073284(),
  };
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    if (mM >= mRows.length) {
      throw new UnsupportedOperationException();
    }
    return mRows[mM].next();
  }
}
