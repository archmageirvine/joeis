package irvine.oeis.a391;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A391877 Number of directed Hamiltonian cycles in the complete 5-partite graph K_{n,n,n,n,n}.
 * @author Sean A. Irvine
 */
public class A391877 extends Sequence1 {

  private int mN = 0;
  private final int mParts;

  protected A391877(final int parts) {
    mParts = parts;
  }

  /** Construct the sequence. */
  public A391877() {
    this(5);
  }

  @Override
  public Z next() {
    ++mN;
    final Bumper bumper = BumperFactory.range(1, mN);
    final int[] k = new int[mParts];
    Arrays.fill(k, 1);
    Z sum = Z.ZERO;
    do {
      final Z prod = Integers.SINGLETON.product(0, mParts - 1, j -> Binomial.binomial(mN - 1, k[j] - 1).multiply(Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(k[j])).multiply(Z.NEG_ONE.pow(mN + k[j]))));
      sum = sum.add(prod.multiply(Functions.FACTORIAL.z(Functions.SUM.l(k) - 1)));
    } while (bumper.bump(k));
    return sum;
  }
}
