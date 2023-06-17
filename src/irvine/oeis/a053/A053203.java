package irvine.oeis.a053;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A053203 Pascal's triangle (excluding first, last three elements of each row) read by rows, row n read mod n.
 * @author Sean A. Irvine
 */
public class A053203 extends AbstractSequence {

  /* Construct the sequence. */
  public A053203() {
    super(6);
  }

  private long mN = 5;
  private long mM = 3;

  @Override
  public Z next() {
    if (++mM >= mN - 2) {
      ++mN;
      mM = 3;
    }
    return Binomial.binomial(mN, mM).mod(Z.valueOf(mN));
  }
}
