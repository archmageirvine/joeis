package irvine.oeis.a104;
// manually knest/jaguarz at 2023-03-01 16:41

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001591;

/**
 * A104412 Number of prime factors, with multiplicity, of the pentanacci numbers A001591.
 * @author Georg Fischer
 */
public class A104412 extends AbstractSequence {

  private final A001591 mSeq1 = new A001591();

  /** Construct the sequence. */
  public A104412() {
    super(4);
  }

  {
    for (int i = 0; i < 4; ++i) {
      mSeq1.next();
    }
  }

  @Override
  public Z next() {
    return Functions.BIG_OMEGA.z(mSeq1.next());
  }
}
